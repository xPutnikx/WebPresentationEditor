package com.itransition.webeditor.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itransition.webeditor.core.SearchQueryJson;
import com.itransition.webeditor.model.Presentations;
import com.itransition.webeditor.service.PresentationsService;
import com.itransition.webeditor.service.UsersService;

/**
 * Handles requests for search.jsp and tags autocomplition.
 * 
 */
@Controller
public class SearchController {
	private static final Logger logger = 
			LoggerFactory.getLogger(SearchController.class);
	
	@Autowired
	private UsersService usersService;
	@Autowired
	private PresentationsService presentationsService;
	
	/**
	 * Handles requests for search.jsp.
	 * 
	 * @param title The title of presentation.
	 * @param tags Presentation tags.
	 * @param model Search model.
	 * @return Search page
	 */
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public String home(
			@RequestParam(value = "title", required = false) String title,
			@RequestParam(value = "tag[]", required = false) String[] tags,
			ModelMap modelMap) {
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
		return "search";
	}
	
	/**
	 * Handles request for tags autocomplition.
	 * 
	 * @param searchQueryJson
	 * @return
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public @ResponseBody String getJson(@ModelAttribute SearchQueryJson searchQueryJson) {
		String query = searchQueryJson.getQuery();	
		if (query == null) {
			return new String("[]");
		}
		/*if (query.length() > 0) {
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
		}*/
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
