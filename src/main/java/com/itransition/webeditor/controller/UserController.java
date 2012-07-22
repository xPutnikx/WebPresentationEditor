package com.itransition.webeditor.controller;

import java.util.List;

import org.jgroups.util.TimeScheduler.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itransition.webeditor.core.AuthenticationManager;
import com.itransition.webeditor.model.PresentationTags;
import com.itransition.webeditor.model.Presentations;
import com.itransition.webeditor.model.Tags;
import com.itransition.webeditor.model.Users;
import com.itransition.webeditor.service.PresentationsService;
import com.itransition.webeditor.service.UsersService;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory
			.getLogger(UserController.class);

	@Autowired
	private UsersService usersService;
	@Autowired
	private PresentationsService presentationsService;

	@RequestMapping(value = "user", method = RequestMethod.GET)
	public String getUserPage(
			@RequestParam(value = "id", required = true) Long id,
			ModelMap modelMap) {
		AuthenticationManager authenticationManager = new AuthenticationManager();
		boolean authenticated = authenticationManager.isAuthenticated();
		modelMap.addAttribute("authenticated", authenticated);
		if (authenticated) {
			modelMap.addAttribute("userName",
					authenticationManager.getUserName());
		}
		Users users = usersService.getUserById(id);
		modelMap.addAttribute("userName", users.getName());
		List<Presentations> presentations = presentationsService
				.findPresentationsByUserId(id);
		modelMap.addAttribute("userPresentationCount", presentations.size());
		modelMap.addAttribute("presentations", presentations);		
		return "user";
	}

}