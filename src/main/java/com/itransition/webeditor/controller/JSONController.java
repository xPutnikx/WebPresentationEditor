package com.itransition.webeditor.controller;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping(value = "/json/", method = RequestMethod.POST)
	public void savePresentation( @RequestParam ("json") String json)
	{

		String place="D:/Work/xPutnikx-WebPresentationEditor-4bbf325/src/main/webapp/resources/data/text.txt";
		saveJson(json,place);
		Presentations presentations=new Presentations();
		presentations.setJSON(json);
		presentations.setUserName("Admin");
		presentations.setId((long) 1);
		presentations.setTags("present tags");
		presentationDao.save(presentations);
	}
	private void saveJson(String json,String place){
		 PrintWriter writer = null;
		    try {
		     writer = new PrintWriter(
		             new OutputStreamWriter(
		             new FileOutputStream(place), "windows-1251"));
		     writer.write(json);
		     writer.close();
		    } catch (Exception ex) {}
	}
}
