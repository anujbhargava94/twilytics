package com.ir.twilytics.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ir.twilytics.model.Doc;
import com.ir.twilytics.model.FacetsParam;
import com.ir.twilytics.service.QueryService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
@RequestMapping(value = "/query")
public class QueryController {

	@Autowired
	QueryService queryService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public @ResponseBody String getTweets(@RequestParam("name") String query) {
		List<Doc> tweets = new ArrayList<>();
		try {
			tweets = queryService.findAll(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Gson jsonString = new Gson();
		return jsonString.toJson(tweets);
	}

	@RequestMapping(value = "/facet", method = RequestMethod.POST)
	public @ResponseBody String getFacetedTweets(@RequestBody FacetsParam facetsParam, @RequestParam("name") String query) {
		List<Doc> tweets = new ArrayList<>();
		try {
			tweets = queryService.getFacetedResults(facetsParam, query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Gson jsonString = new Gson();
		return jsonString.toJson(tweets);
	}

}
