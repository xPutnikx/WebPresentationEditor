package com.itransition.webeditor.core;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * Provides access to base authentication features.
 *
 */
public class AuthenticationManager {
	private boolean authenticated;
	private Authentication authentication;

	/**
	 * Constructor.
	 * 
	 */
	public AuthenticationManager() {
		this.authentication = 
			SecurityContextHolder.getContext().getAuthentication();
		this.authenticated = 
			!getUserRole().equals(UserRolesTypes.ROLE_ANONYMOUS);
	}

	/**
	 * Check authentication.
	 * 
	 * @return authenticated.
	 */
	public boolean isAuthenticated() {
		return authenticated;
	}

	/**
	 * Get user name from security context.
	 * 
	 * @return user name.
	 */
	public String getUserName() {
		if (authenticated) {
			User user = (User) authentication.getPrincipal();
			return user.getUsername();
		}
		return null;
	}
	
	/**
	 * Get user role from security context.
	 * 
	 * @return user role.
	 */
	@SuppressWarnings("unchecked")
	public String getUserRole() {
		List<GrantedAuthority> roles = 
			(List<GrantedAuthority>) authentication.getAuthorities();
		return roles.get(0).toString();
	}

}
