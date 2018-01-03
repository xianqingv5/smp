package com.yiche.smp.config;

import com.yiche.common.mybatis.SqlMonitorManager;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.util.ClassUtils;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

@Configuration
@MapperScan(basePackages = "com.yiche.smp.mapper")
public class DataSourceConfig {
    @Value("${datasource.driverClass}")
    private String driverClass;
    @Value("${datasource.jdbcUrl}")
    private String jdbcUrl;
    @Value("${datasource.user}")
    private String user;
    @Value("${datasource.password}")
    private String password;
    @Value("${datasource.initialPoolSize}")
    private int initialPoolSize;
    @Value("${datasource.maxActive:500}")
    private int maxActive;
    @Value("${datasource.minIdle:100}")
    private int minIdle;
    @Value("${datasource.maxIdle:500}")
    private int maxIdle;
    @Value("${datasource.validateInterval:30}")
    private int validateInterval;
    @Value("${db.isEmbedded:false}")
    private boolean isEmbedded;

    @Bean
    public DataSource dataSource() {
        org.apache.tomcat.jdbc.pool.DataSource dataSource = new org.apache.tomcat.jdbc.pool.DataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(user);
        dataSource.setPassword(password);

        dataSource.setInitialSize(initialPoolSize);
        dataSource.setMaxActive(maxActive);
        dataSource.setMaxIdle(maxIdle);
        dataSource.setMinIdle(minIdle);
        dataSource.setMinEvictableIdleTimeMillis(5000);
        dataSource.setDefaultTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);

        dataSource.setValidationQuery("select 1");
        dataSource.setValidationInterval(validateInterval);
        dataSource.setTestOnBorrow(true);
        dataSource.setTestWhileIdle(true);
        dataSource.setRemoveAbandoned(true);
        dataSource.setRemoveAbandonedTimeout(30);

        return dataSource;
    }

    public Resource[] getResource(String basePackage, String pattern ) throws IOException {
        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX
                + ClassUtils.convertClassNameToResourcePath(new StandardEnvironment()
                .resolveRequiredPlaceholders(basePackage)) + "/" + pattern;
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources(packageSearchPath);
        return resources;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(getResource("mapper", "**/*.xml"));
        SqlMonitorManager sqlMonitorManager = new SqlMonitorManager();
        Properties properties = new Properties();
        properties.setProperty("show_sql", "true");
        sqlMonitorManager.setProperties(properties);
        sessionFactory.setPlugins(new Interceptor[]{sqlMonitorManager});
        return sessionFactory.getObject();
    }

}
