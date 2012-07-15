package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.core.userdetails.User;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	@RequestMapping(value = "home.html", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!");
		model.addAttribute("controllerMessage",
				"Home page");
		
		model.addAttribute("tagCloud",tagCloud());
		return "home";
	}
	private String tagCloud(){
		return "<ul><li></li><li></li><li></li><li>" +
				"</li><li></li><li></li><li></li><li>+" +
				"</li><li></li><li></li><li></li>";
	}
}
