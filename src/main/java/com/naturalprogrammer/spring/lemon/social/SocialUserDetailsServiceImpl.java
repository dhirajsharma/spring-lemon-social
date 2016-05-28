package com.naturalprogrammer.spring.lemon.social;

import java.io.Serializable;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;

import com.naturalprogrammer.spring.lemon.security.UserDetailsServiceImpl;

public class SocialUserDetailsServiceImpl<U extends AbstractSocialUser<U,ID>, ID extends Serializable> extends
	UserDetailsServiceImpl<U, ID> implements SocialUserDetailsService  {

	public SocialUserDetails loadUserByUserId(String userId) throws UsernameNotFoundException {
		
		return (SocialUserDetails) loadUserByUsername(userId);
	}
}
