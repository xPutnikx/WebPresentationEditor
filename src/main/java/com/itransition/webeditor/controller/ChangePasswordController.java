package com.itransition.webeditor.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itransition.webeditor.core.AuthenticationManager;
import com.itransition.webeditor.model.Tags;
import com.itransition.webeditor.model.Users;
import com.itransition.webeditor.service.UsersService;

@Controller
@RequestMapping("/")
public class ChangePasswordController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(method = RequestMethod.POST, value = "changepassword")
	public String changePassword(@RequestParam ("password") String password,@RequestParam ("id") Long id) {
		logger.debug("Received postback on person " + password);
		System.out.println("pas= "+password);
		Users users=usersService.getUserById(id);
		users.setPassword(password);
		usersService.save(users);
		return "redirect:userpage";
	}
	@RequestMapping(method = RequestMethod.GET, value = "changepassword")
	public String changePassword(
			@RequestParam(value = "id", required = false) Long id,ModelMap modelMap) {
		AuthenticationManager authenticationManager = new AuthenticationManager();
		boolean authenticated = authenticationManager.isAuthenticated();
		modelMap.addAttribute("authenticated", authenticated);
		if (authenticated) {
			modelMap.addAttribute("userName",
					authenticationManager.getUserName());
		}
		logger.debug("change password : " + id);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername();
		Users users=usersService.getUserByName(name);
		String pass=users.getPassword();
		Long ID =users.getId();
		modelMap.addAttribute("username", name);
		modelMap.addAttribute("password", pass);
		modelMap.addAttribute("id", ID);
		return "changepassword";
	}
}
