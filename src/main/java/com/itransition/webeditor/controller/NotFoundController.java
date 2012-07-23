package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.itransition.webeditor.core.AuthenticationManager;

/**
 * Handles requests for notfound.jsp.
 * 
 */
@Controller
public class NotFoundController {
	private static final Logger logger = LoggerFactory
			.getLogger(NotFoundController.class);

	/**
	 * Handles requests for notfound.jsp.
	 * 
	 * @param modelMap
	 *            Notfound model.
	 * @return Notfound page.
	 */
	@RequestMapping(value = "notfound", method = RequestMethod.GET)
	public String getHomePage(ModelMap modelMap) {
		AuthenticationManager authenticationManager = new AuthenticationManager();
		boolean authenticated = authenticationManager.isAuthenticated();
		modelMap.addAttribute("authenticated", authenticated);
		if (authenticated) {
			modelMap.addAttribute("userName",
					authenticationManager.getUserName());
		}
		return "notfound";
	}

}
