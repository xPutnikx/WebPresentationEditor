package com.itransition.webeditor.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.itransition.webeditor.core.AuthenticationManager;
import com.itransition.webeditor.dao.TagsDao;
import com.itransition.webeditor.model.Tags;

@Controller
public class AboutController {
	@Autowired
	private TagsDao tagsDao;
	private static final Logger logger = LoggerFactory
			.getLogger(AboutController.class);
	
	@RequestMapping(value = "about", method = RequestMethod.GET)
	public String home(ModelMap modelMap) {
		AuthenticationManager authenticationManager = new AuthenticationManager();
		boolean authenticated = authenticationManager.isAuthenticated();
		modelMap.addAttribute("authenticated", authenticated);
		if (authenticated) {
			modelMap.addAttribute("userName",
					authenticationManager.getUserName());
		}
		logger.info("About");
		List<Tags> tags = tagsDao.getTags();
		logger.debug("Tag Listing count = " + tags.size());
		modelMap.addAttribute("tags", tags);
		return "about";
	}
}
