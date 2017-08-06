package com.zlp.springboot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataProperties {
	
	@Value("${data.user}")
	private String user;
	
	@Value("${data.name}")
	private String name;

	public String getUser() {
		return user;
	}

	
	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

}
