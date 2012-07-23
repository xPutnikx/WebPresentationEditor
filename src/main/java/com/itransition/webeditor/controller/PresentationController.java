package com.itransition.webeditor.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itransition.webeditor.core.AuthenticationManager;
import com.itransition.webeditor.model.Presentations;
import com.itransition.webeditor.model.Tags;
import com.itransition.webeditor.model.Users;
import com.itransition.webeditor.service.PresentationsService;
import com.itransition.webeditor.service.UsersService;

@Controller
public class PresentationController {
	private static final Logger logger = LoggerFactory
			.getLogger(PresentationController.class);

	@Autowired
	private UsersService usersService;
	@Autowired
	private PresentationsService presentationsService;

	@RequestMapping(value = "presentation", method = RequestMethod.GET)
	public String getPresentationPage(
			@RequestParam(value = "id", required = true) Long id,
			ModelMap modelMap) {
		AuthenticationManager authenticationManager = new AuthenticationManager();
		boolean authenticated = authenticationManager.isAuthenticated();
		modelMap.addAttribute("authenticated", authenticated);
		if (authenticated) {
			modelMap.addAttribute("userName",
					authenticationManager.getUserName());
		}
		Presentations presentations = presentationsService.findById(id);
		if (presentations != null) {
			modelMap.addAttribute("presentationId", presentations.getId());
			modelMap.addAttribute("presentationTitle", presentations.getTitle());
			Users users = usersService.findById(presentations.getUserId());
			if (users != null) {
				modelMap.addAttribute("presentationUser", users.getName());
				List<Tags> tags = presentationsService
						.findTagsByPresentationId(id);
				modelMap.addAttribute("presentationTags", tags);
				if (authenticated) {
					modelMap.addAttribute("isAuthor", authenticationManager
							.getUserName().equals(users.getName()));
				}
			} else {
				logger.warn("There is presentation without author!");
			}
		} else {
			logger.warn("Presentation with id=" + id + " not found!");
			return "notfound";
		}
		return "presentation";
	}

	@RequestMapping(value = "presentation/delete", method = RequestMethod.POST)
	public void deletePresentation(@RequestParam("id") Long id) {
		presentationsService.removeById(id);		
	}

}