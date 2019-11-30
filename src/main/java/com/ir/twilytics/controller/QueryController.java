package com.ir.twilytics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ir.twilytics.model.Doc;
import com.ir.twilytics.model.FacetsParam;
import com.ir.twilytics.service.QueryService;

@Controller
@RequestMapping(value = "/query")
public class QueryController {

	@Autowired
	QueryService queryService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public @ResponseBody String getTweets(@RequestParam("name") String query) {
		List<Doc> tweets = queryService.findAll(query);
		Gson jsonString = new Gson();
		return jsonString.toJson(tweets);
	}

	@RequestMapping(value = "/facet", method = RequestMethod.GET)
	public @ResponseBody String getFacetedTweets(@RequestBody FacetsParam facetsParam) {
		List<Doc> tweets = queryService.getFacetedResults(facetsParam);
		Gson jsonString = new Gson();
		return jsonString.toJson(tweets);
	}
	
	
}
