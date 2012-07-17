package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView changePassword(
			@RequestParam(value = "id", required = false) Long id) {
		logger.debug("change password : " + id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("changepassword");
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername();
		Users users=usersService.getUserByName(name);
		String pass=users.getPassword();
		Long ID =users.getId();
		mav.addObject("username", name);
		mav.addObject("password", pass);
		mav.addObject("id", ID);
		return mav;
	}
}
