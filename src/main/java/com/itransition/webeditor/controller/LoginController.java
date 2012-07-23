package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.itransition.webeditor.core.AuthenticationManager;

/**
 * Handles requests for login.jsp.
 * 
 */
@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory
			.getLogger(LoginController.class);

	/**
	 * Handles requests for login.jsp.
	 * 
	 * @param modelMap
	 *            Login model.
	 * @return Login page.
	 */
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String getLoginPage(ModelMap modelMap) {
		AuthenticationManager authenticationManager = new AuthenticationManager();
		boolean authenticated = authenticationManager.isAuthenticated();
		modelMap.addAttribute("authenticated", authenticated);
		if (authenticated) {
			modelMap.addAttribute("userName",
					authenticationManager.getUserName());
		}
		return "login";
	}

}
