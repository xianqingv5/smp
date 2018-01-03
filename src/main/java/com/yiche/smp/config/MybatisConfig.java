package com.yiche.smp.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.util.ClassUtils;

import javax.sql.DataSource;
import java.io.IOException;

/*
 * @see http://mybatis.github.io/spring/mappers.html
 */
@Configuration
@MapperScan(basePackages = "com.yiche.smp.mapper")
public class MybatisConfig {

	private static Logger log = LoggerFactory.getLogger(MybatisConfig.class);

	@Value("${datasource.driverClass}")
	private String jdbcDriver;

	@Value("${datasource.user}")
	private String username;

	@Value("${datasource.password}")
	private String password;

	@Value("${datasource.jdbcUrl}")
	private String url;

	@Bean
	public DataSource dataSource() {
		DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName(jdbcDriver);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.setUrl(url);
//		ds.setMaxActive(maxActive);
//		ds.setValidationQuery(validationquery);
//		ds.setTestOnBorrow(jdbcConnectionSettings.getTestOnBorrow());
//		ds.setTestOnReturn(jdbcConnectionSettings.getTestOnReturn());
//		ds.setTestWhileIdle(jdbcConnectionSettings.getTestWhileIdle());
//		ds.setTimeBetweenEvictionRunsMillis(jdbcConnectionSettings.getTimeBetweenEvictionRunsMillis());
//		ds.setMinEvictableIdleTimeMillis(jdbcConnectionSettings.getMinEvictableIdleTimeMillis());
		return ds;
	}


	public Resource[] getResource(String basePackage, String pattern ) throws IOException {
		String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX
				+ ClassUtils.convertClassNameToResourcePath(new StandardEnvironment()
				.resolveRequiredPlaceholders(basePackage)) + "/" + pattern;
		Resource[] resources = new PathMatchingResourcePatternResolver().getResources(packageSearchPath);
		return resources;
	}


	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		log.debug("> sqlSessionFactory");
		final SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		sqlSessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
		sqlSessionFactory.setFailFast(true);
		sqlSessionFactory.setMapperLocations(getResource("mapper", "**/*.xml"));
//		sqlSessionFactory.setTypeHandlersPackage("demo.springboot.configuration.mybatis.typehandler");
		return sqlSessionFactory.getObject();
	}


	@Bean
	public DataSourceTransactionManager transactionManager() {
		//log.debug("transactionManager");
		return new DataSourceTransactionManager(dataSource());
	}
}
