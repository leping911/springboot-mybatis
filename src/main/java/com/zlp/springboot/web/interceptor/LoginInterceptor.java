package com.zlp.springboot.web.interceptor;

import com.zlp.springboot.vo.LoginProfile;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by lenovo on 2017/8/7.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse,
                             Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        boolean flag = false;
        if(session != null && httpServletRequest.getRequestURI().indexOf("/login") == -1) {
            LoginProfile prof =  (LoginProfile)session.getAttribute(LoginProfile.AUTH_LOGIN_PROFILE);
            if(prof != null && prof.getUsr_id() > 0) {
                flag = true;
            }
            if(!flag) {
                httpServletResponse.sendRedirect("/login");
            }
        }
        return true;
    }
}
