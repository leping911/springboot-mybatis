package com.zlp.springboot.config;

import com.zlp.springboot.web.interceptor.LoginInterceptor;
import com.zlp.springboot.web.interceptor.MyInterceptor;
import com.zlp.springboot.web.resolver.LoginProfArgumentResolver;
import com.zlp.springboot.web.resolver.PageArgumentResolver;
import com.zlp.springboot.web.resolver.ParamsArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;


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

        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*");//添加拦截器并配置拦截请求

    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
        argumentResolvers.add(new LoginProfArgumentResolver());
        argumentResolvers.add(new PageArgumentResolver());
        argumentResolvers.add(new ParamsArgumentResolver());
    }
}
