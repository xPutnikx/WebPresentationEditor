package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!");
		model.addAttribute("controllerMessage",
				"Home page");
		model.addAttribute("tagCloud",tagCloud());
		return "home";
	}
	private String tagCloud(){
		return "<div id=\"item\">"+
		"<ul>"+
		"<li><a href=\"registrationform.html\">Registration</a></li>"+
		"<li><a href=\"loginform.html\">Login</a></li>"+	
		"<li><a href=\"#\">Logout</a></li>"+
		"<li><a href=\"about.html\">About</a></li>"+
		"<li><a href=\"contact.html\">Contact</a></li>"+
		"<li>3D</li>"+
		"<li>Ajax</li>"+
		"<li>CSS</li>"+
		"<li>Design</li>"+
		"<li>Flash</li>"+
		"<li>Experimental</li>"+
		"<li>Development</li>"+
		"<li>web</li>"+
		"<li>Tutorial</li>"+
		"<li>ASP</li>"+
	"</ul>"+
"</div>";
	}
}
