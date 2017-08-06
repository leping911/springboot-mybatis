package com.zlp.springboot.config;

import com.zlp.springboot.web.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * 配置拦截器
 * @author Leepec.zeng
 * @create 2017-07-06 15:21
 **/

@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);

        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/*");//添加拦截器并配置拦截请求

    }
}
