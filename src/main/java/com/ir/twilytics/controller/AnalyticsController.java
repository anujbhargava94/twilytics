package com.ir.twilytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ir.twilytics.model.FacetFields;
import com.ir.twilytics.model.FacetsParam;
import com.ir.twilytics.service.AnalyticsService;
import com.ir.twilytics.service.QueryService;

@Controller
@RequestMapping(value = "/fetch")
public class AnalyticsController {

	@Autowired
	AnalyticsService analyticsService;
	
	@Autowired
	QueryService queryService;

	@RequestMapping(value = "/fields", method = RequestMethod.POST)
	public @ResponseBody String getFacetedFields(@RequestBody FacetsParam facetsParam, @RequestParam("name") String query) {
		FacetFields tweets = new FacetFields();
		//List<Doc> tweets = new ArrayList<Doc>();
		try {
			facetsParam.setRows(0);
			facetsParam.setFacet("true");
			tweets = analyticsService.getFacetedFields(facetsParam, query);
			//tweets = queryService.getFacetedResults(facetsParam);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Gson jsonString = new Gson();
		return jsonString.toJson(tweets);
	}
}
