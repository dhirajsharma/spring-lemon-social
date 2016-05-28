package com.naturalprogrammer.spring.lemon.social;

import java.io.Serializable;

import org.springframework.social.security.SocialUserDetails;

import com.naturalprogrammer.spring.lemon.domain.AbstractUser;

public class AbstractSocialUser<U extends AbstractSocialUser<U,ID>, ID extends Serializable>
extends AbstractUser<U, ID> implements SocialUserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = -327485650406729728L;

	public String getUserId() {

		return getUsername();
	}
}
