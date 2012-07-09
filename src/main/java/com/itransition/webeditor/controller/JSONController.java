package com.itransition.webeditor.controller;

import org.codehaus.jackson.map.util.JSONPObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itransition.webeditor.dao.PresentationDao;
import com.itransition.webeditor.model.Presentations;
@Controller
public class JSONController{

	@Autowired
	private PresentationDao presentationDao;
	private static final Logger logger = LoggerFactory
			.getLogger(JSONController.class);
	/**
	 * Selects the home page and populates the model with a message
	 */
	private String data=null;
	@RequestMapping(value = "/json/", method = RequestMethod.POST)
	public void savePresentation( @RequestParam ("json") String json)
	{
		System.out.println("<---------------"+json);
		Presentations presentations=new Presentations();
		presentations.setJSON("42");
		presentations.setUserName("Admin");
		presentations.setId((long) 1);
		presentations.setTags("present tags");
		presentationDao.save(presentations);
		System.out.println(presentationDao.find((long)1));
	}
	private void saveData(@ModelAttribute Presentations presentations){
		
	}
}
