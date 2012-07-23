package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.itransition.webeditor.core.AuthenticationManager;

/**
 * Handles requests for home.jsp.
 * 
 */
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Handles requests for home.jsp.
	 * 
	 * @param modelMap
	 *            Home model.
	 * @return Home page.
	 */
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String getHomePage(ModelMap modelMap) {
		AuthenticationManager authenticationManager = new AuthenticationManager();
		boolean authenticated = authenticationManager.isAuthenticated();
		modelMap.addAttribute("authenticated", authenticated);
		if (authenticated) {
			modelMap.addAttribute("userName",
					authenticationManager.getUserName());
		}
		return "home";
	}

}
