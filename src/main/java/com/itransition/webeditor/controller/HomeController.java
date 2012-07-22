package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.itransition.webeditor.core.AuthenticationManager;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView mav=new ModelAndView();
		AuthenticationManager authenticationManager = new AuthenticationManager();
		boolean authenticated = authenticationManager.isAuthenticated();
		mav.addObject("authenticated", authenticated);
		if (authenticated) {
			mav.addObject("userName",
					authenticationManager.getUserName());
		}
		mav.setViewName("home");
		return mav;
	}

}
