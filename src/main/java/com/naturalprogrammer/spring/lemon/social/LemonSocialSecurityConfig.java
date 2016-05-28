package com.naturalprogrammer.spring.lemon.social;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.social.security.SpringSocialConfigurer;

import com.naturalprogrammer.spring.lemon.security.LemonSecurityConfig;

public abstract class LemonSocialSecurityConfig extends LemonSecurityConfig {

	protected void otherConfigurations(HttpSecurity http)  throws Exception {
		super.otherConfigurations(http);
		http.apply(new SpringSocialConfigurer());
	}
}
