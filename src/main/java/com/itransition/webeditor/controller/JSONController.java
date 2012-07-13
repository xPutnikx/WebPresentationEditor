package com.itransition.webeditor.controller;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.itransition.webeditor.dao.PresentationsDao;
import com.itransition.webeditor.model.Presentations;
import com.itransition.webeditor.model.Users;
@Controller
public class JSONController{

	@Autowired
	private PresentationsDao presentationDao;
	private static final Logger logger = LoggerFactory
			.getLogger(JSONController.class);
	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/json/", method = RequestMethod.POST)
	public void savePresentation( @RequestParam ("json") String json)
	{
		Presentations presentations=new Presentations();
		presentations.setData(json);
		presentations.setUserId("1");
		presentationDao.save(presentations);
	}
	@RequestMapping(value = "/jsons/", method = RequestMethod.POST)
	public @ResponseBody String openPresentation( @RequestParam ("json") String json)
	{
		Long id = (long) 1;
		Presentations presentations = null;
		presentations = presentationDao.findById(id);
		String jsonResponse=presentations.getData();
		return jsonResponse;
	}
}
