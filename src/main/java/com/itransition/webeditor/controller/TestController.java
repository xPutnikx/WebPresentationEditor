package com.itransition.webeditor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itransition.webeditor.core.SearchQueryJson;
import com.itransition.webeditor.core.SearchResponseJson;

@Controller
public class TestController {
	
	/*@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON(@PathVariable String name) {		 
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"}); 
		return shop; 
	}*/
	
	/*@RequestMapping(value = "edit", method = RequestMethod.POST)
	public void get2(@ModelAttribute Shop shop) {
		System.out.println("hih");
		System.out.println(shop.getName());
	}*/
	
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public @ResponseBody String getJson(@ModelAttribute SearchQueryJson searchQueryJson) {
		//System.out.println("hih");
		//System.out.println(searchQueryJson.getAsd());	
		System.out.println(searchQueryJson.getQuery());			
		return new String("[\"value\", \"google\"]");	
	}
 
}
