package com.zlp.springboot.web.resolver;

import com.zlp.springboot.entity.User;
import com.zlp.springboot.utils.Page;
import com.zlp.springboot.utils.Params;
import com.zlp.springboot.utils.StaticUtils;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;


@SuppressWarnings("rawtypes")
public class LouisArgumentResolver implements WebArgumentResolver {

	public Object resolveArgument(MethodParameter methodParameter, NativeWebRequest webRequest) throws Exception {
		if (methodParameter.getParameterType().equals(User.class)) {
			return webRequest.getAttribute(StaticUtils.AUTH_LOGIN_PROFILE, RequestAttributes.SCOPE_SESSION);
		} else if (methodParameter.getParameterType().equals(Page.class)) {
			return new Page(webRequest);
		} else if (methodParameter.getParameterType().equals(Params.class)) {
			return new Params(webRequest);
		}
		return UNRESOLVED;
	}
}
