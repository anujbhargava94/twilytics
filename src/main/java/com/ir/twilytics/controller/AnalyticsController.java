package com.ir.twilytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ir.twilytics.model.FacetFields;
import com.ir.twilytics.service.AnalyticsService;

@Controller
@RequestMapping(value = "/fetch")
public class AnalyticsController {

	@Autowired
	AnalyticsService analyticsService;

	@RequestMapping(value = "/fields", method = RequestMethod.GET)
	public @ResponseBody String getFacetedFields(@RequestParam("name") String query) {
		FacetFields tweets = new FacetFields();
		try {
			tweets = analyticsService.getFacetedFields(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Gson jsonString = new Gson();
		return jsonString.toJson(tweets);
	}
}
