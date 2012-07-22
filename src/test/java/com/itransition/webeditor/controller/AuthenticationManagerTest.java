package com.itransition.webeditor.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.itransition.webeditor.core.AuthenticationManager;
import com.itransition.webeditor.core.UserRolesTypes;
@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class AuthenticationManagerTest {
	
	private boolean authenticated;
	private Authentication authentication;
	private AuthenticationManager authenticationManager;
	private User user;

	@Before
	public void setUp() throws Exception {
		authenticationManager = new AuthenticationManager();
	    user = EasyMock.createMock(User.class);
	    authentication=EasyMock.createMock(Authentication.class);
	    authenticationManager.getUserName();
	    authenticationManager.getUserRole();
	    authenticationManager.isAuthenticated();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isAuthenticatedTest() {
		assertNotNull(authenticated);
	}
	@Test
	public void getUserName() {
		EasyMock.expect(authentication.getPrincipal());
		EasyMock.expect(user.getUsername()).andReturn("admin");
		EasyMock.replay(authentication);
		user = (User) authentication.getPrincipal();
		EasyMock.verify(authentication);
		assertEquals("admin",user.getUsername());

	}
	public void getUserRoleTest() {
		List<GrantedAuthority> roles = 
				(List<GrantedAuthority>) authentication.getAuthorities();
		EasyMock.expect(authentication.getAuthorities().toString()).andReturn("ROLE_ADMIN");
		EasyMock.replay(authentication);
		assertEquals("ROLE_ADMIN", roles.get(0));
		EasyMock.verify(authentication);
	}

}
