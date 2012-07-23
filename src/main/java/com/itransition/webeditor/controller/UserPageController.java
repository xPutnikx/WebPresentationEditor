package com.itransition.webeditor.controller;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itransition.webeditor.core.AuthenticationManager;
import com.itransition.webeditor.service.UsersService;


@Controller
public class UserPageController {
	private static final Logger logger = LoggerFactory
			.getLogger(UserPageController.class);
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value="userpage", method = RequestMethod.GET)
	public String showUserPage(ModelMap modelMap) { 
		AuthenticationManager authenticationManager = new AuthenticationManager();
		boolean authenticated = authenticationManager.isAuthenticated();
		modelMap.addAttribute("authenticated", authenticated);
		String name=authenticationManager.getUserName();
		modelMap.addAttribute("userName", name);
		String role=authenticationManager.getUserRole();
		modelMap.addAttribute("userrole",role);
		Long id = usersService.getUserByName(name).getId();
		modelMap.addAttribute("userId",id);
		return "userpage"; 
	}
}
