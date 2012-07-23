package com.itransition.webeditor.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.itransition.webeditor.core.AuthenticationManager;
import com.itransition.webeditor.core.SearchQueryJson;
import com.itransition.webeditor.model.Presentations;
import com.itransition.webeditor.service.PresentationsService;

/**
 * Handles requests for presentations.jsp and tags autocomplition.
 * 
 */
@Controller
public class PresentationsController {
	private static final Logger logger = 
			LoggerFactory.getLogger(PresentationsController.class);
	
	@Autowired
	private PresentationsService presentationsService;
	
	/**
	 * Handles requests for presentations.jsp.
	 * 
	 * @param title The title of presentation.
	 * @param tags Presentation tags.
	 * @param model Search model.
	 * @return Search page
	 */
	@RequestMapping(value = "presentations", method = RequestMethod.GET)
	public String home(
			@RequestParam(value = "title", required = false) String title,
			@RequestParam(value = "tag[]", required = false) String[] tags,
			ModelMap modelMap) {
		AuthenticationManager authenticationManager = new AuthenticationManager();
		boolean authenticated = authenticationManager.isAuthenticated();
		modelMap.addAttribute("authenticated", authenticated);
		if (authenticated) {
			modelMap.addAttribute("userName",
					authenticationManager.getUserName());
		}
		String titleValue = generateTitleAreaValue(title);
		modelMap.addAttribute("titleAreaValue", titleValue);
		String tagsValue = generateTagsAreaValue(tags);
		modelMap.addAttribute("tagsAreaValue", tagsValue);		
		List<Presentations> presentations = null;
		if (title == null && tags == null) {
			presentations = presentationsService.getPresentations();
		} else if (title != null && tags != null) {
			presentations = presentationsService.searchByTitleAndTags(title, tags);			
		} else if (title != null) {
			presentations = presentationsService.searchByTitle(title);
		} else if (tags != null) {
			presentations = presentationsService.searchByTags(tags);
		}		
		modelMap.addAttribute("presentations", presentations);
		return "presentations";
	}
	
	/**
	 * Handles request for tags autocomplition.
	 * 
	 * @param searchQueryJson
	 * @return
	 */
	@RequestMapping(value = "presentations", method = RequestMethod.POST)
	public @ResponseBody String getJson(@ModelAttribute SearchQueryJson searchQueryJson) {
		String query = searchQueryJson.getQuery();	
		if (query == null) {
			return new String("[]");
		}
		if (query.length() > 0) {
			List<String> tagNames = presentationsService.searchTagsByName(query);
			if (tagNames.size() == 0) {
				return new String("[]");
			} else if (tagNames.size() == 1) {
				return new String("[\"" + tagNames.get(0) + "\"]");
			} else {
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append("[");
				for (int i = 0; i < tagNames.size() - 1; i++) {
					stringBuilder.append("\"" + tagNames.get(i) + "\", ");
				}
				stringBuilder.append("\"" + tagNames.get(tagNames.size() - 1) + "\"]");
				return stringBuilder.toString();
			}
		}
		return new String("[]");
	}
	
	private String generateTitleAreaValue(String title) {
		if (title == null) {
			return "";
		} else {
			return title;
		}
	}
	
	private String generateTagsAreaValue(String[] tags) {
		if (tags == null) {
			return null;
		} else {
			StringBuilder stringBuilder = new StringBuilder();			
			for (String tag : tags) {
				stringBuilder.append(tag + ",");
			}
			return stringBuilder.toString();			
		}
	}
}
