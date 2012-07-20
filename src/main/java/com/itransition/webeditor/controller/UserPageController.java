package com.itransition.webeditor.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserPageController {

	private static final Logger logger = LoggerFactory
			.getLogger(UserPageController.class);
	@RequestMapping(value="userpage", method = RequestMethod.GET)
	public String showUserPage(ModelMap model) { 
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername();
		List<GrantedAuthority> roles =  (List<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		String role=roles.get(0).toString();
		model.addAttribute("username", name);
		model.addAttribute("userrole",role);
		return "userpage"; 
	}
}
