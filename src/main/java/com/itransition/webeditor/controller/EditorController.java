package com.itransition.webeditor.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itransition.webeditor.core.AuthenticationManager;
import com.itransition.webeditor.dao.TagsDao;
import com.itransition.webeditor.model.Presentations;
import com.itransition.webeditor.model.Users;
import com.itransition.webeditor.service.PresentationsService;
import com.itransition.webeditor.service.UsersService;

@Controller
public class EditorController {
	private static final Logger logger = LoggerFactory
			.getLogger(EditorController.class);

	@Autowired
	private UsersService usersService;
	@Autowired
	private PresentationsService presentationsService;

	@RequestMapping(value = "editor", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("editor!");
		model.addAttribute("controllerMessage", "Edit");
		return "editor";
	}

	@RequestMapping(value = "json", method = RequestMethod.POST)
	public void savePresentation(@RequestParam("json") String json,
			@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("tags") String tags) {		
		String[] tagsArray = tags.replace("\"", "").replace("[", "")
				.replace("]", "").split(",");
		AuthenticationManager authenticationManager = new AuthenticationManager();
		if (authenticationManager.isAuthenticated()) {			
			String userName = authenticationManager.getUserName();
			Users users = usersService.getUserByName(userName);					
			List<Presentations> presentationsList = presentationsService
					.findPresentationsByUserId(users.getId());						
			for (Presentations presentation : presentationsList) {				
				if (presentation.getTitle().equals(title)) {					
					presentation.setDescription(description);
					presentation.setData(json);
					presentationsService.save(presentation);
					presentationsService.addTags(Arrays.asList(tagsArray), presentation.getId());
					return;
				}
			}			
			Presentations presentations = new Presentations();
			presentations.setUserId(users.getId());
			presentations.setTitle(title);
			presentations.setDescription(description);
			presentations.setData(json);
			presentationsService.save(presentations);			
			presentationsList = presentationsService.findPresentationsByUserId(users.getId());						
			for (Presentations presentation : presentationsList) {				
				if (presentation.getTitle().equals(title)) {						
					presentationsService.addTags(Arrays.asList(tagsArray), presentation.getId());
					break;
				}
			}
		} else {
			logger.warn("Not authenticated operation at Web Editor: Save as dialog.");
		}
	}

	@RequestMapping(value = "/jsons", method = RequestMethod.POST)
	public @ResponseBody
	String openPresentation(@RequestParam("json") long json) {
		Presentations presentations = null;
		presentations = presentationsService.findById(json);
		String jsonResponse = presentations.getData();
		return jsonResponse;
	}
}
