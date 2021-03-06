package com.zlp.springboot.web.resolver;

import com.zlp.springboot.vo.LoginProfile;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Created by lenovo on 2017/8/7.
 */
public class LoginProfArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getParameterType().equals(LoginProfile.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Object prof = nativeWebRequest.getAttribute(LoginProfile.AUTH_LOGIN_PROFILE, RequestAttributes.SCOPE_SESSION);
        return prof;
    }
}
