package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.itransition.webeditor.dao.TagsDao;
import com.itransition.webeditor.model.Presentations;
import com.itransition.webeditor.model.Tags;
import com.itransition.webeditor.service.PresentationsService;
import com.itransition.webeditor.service.UsersService;

@Controller
public class JSONController{

	@Autowired
	private PresentationsService presentationsService;
	@Autowired
	private TagsDao tagsDao;
	@Autowired
	private UsersService usersService;
	private static final Logger logger = LoggerFactory
			.getLogger(JSONController.class);
	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "json", method = RequestMethod.POST)
	public void savePresentation( @RequestParam ("json") String json,
			@RequestParam ("title") String title, @RequestParam ("tagstring") String tagstring,
			@RequestParam ("description") String description)
	{
		System.out.println(json);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername();
		Long id=usersService.getUserByName(name).getId();
		Presentations presentations=new Presentations();
		Tags tags =new Tags();
		presentations.setData(json);
		presentations.setTitle(title);
		presentations.setDescription(description);
		tags.setName(tagstring);
		presentations.setUserId(id);
		tagsDao.save(tags);
		presentationsService.save(presentations);
		
	}
	@RequestMapping(value = "/jsons", method = RequestMethod.POST)
	public @ResponseBody String openPresentation( @RequestParam ("json") long json)
	{
		Long id = (long) 1;
		Presentations presentations = null;
		presentations = presentationsService.findById(json);
		String jsonResponse=presentations.getData();
		return jsonResponse;
	}
}
