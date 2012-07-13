package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.itransition.webeditor.model.Presentations;
import com.itransition.webeditor.service.PresentationsService;
@Controller
public class JSONController{

	@Autowired
	private PresentationsService presentationsService;
	private static final Logger logger = LoggerFactory
			.getLogger(JSONController.class);
	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/json/", method = RequestMethod.POST)
	public void savePresentation( @RequestParam ("json") String json,
			@RequestParam ("title") String title, @RequestParam ("tagstring") String tags,
			@RequestParam ("description") String description)
	{
		Presentations presentations=new Presentations();
		presentations.setData(json);
		presentations.setTitle(title);
		presentations.setDescription(description);
		presentations.setUserId("1");
		presentationsService.save(presentations);
	}
	@RequestMapping(value = "/jsons/", method = RequestMethod.POST)
	public @ResponseBody String openPresentation( @RequestParam ("json") long json)
	{
		Long id = (long) 1;
		Presentations presentations = null;
		presentations = presentationsService.findById(json);
		String jsonResponse=presentations.getData();
		return jsonResponse;
	}
}
