package com.yiche.smp.config;

import com.yiche.smp.config.intercept.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/14
 */
@Configuration
public class WebConfigurerAdapter extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns("/intelligent/login", "/exportExcel",
                "/download/enclosure", "/download/boost", "/download/apply","/intelligent/downloadExcel",
                "/upload/uncheatAttachment", "/upload/boost", "/upload/apply", "/", "/intelligent/loginOut","/exportSumExce"
        );
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }
}
