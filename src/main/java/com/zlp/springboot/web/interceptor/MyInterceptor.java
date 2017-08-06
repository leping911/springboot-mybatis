package com.zlp.springboot.web.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 创建自己的拦截器类并实现 HandlerInterceptor 接口。
 * @author Leepec.zeng
 * @create 2017-07-06 21:20
 **/
public class MyInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse,
                             Object o) throws Exception {
        System.out.println("interceptor");
        return true;
    }
}
