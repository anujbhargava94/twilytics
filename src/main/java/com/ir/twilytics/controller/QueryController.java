package com.ir.twilytics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ir.twilytics.apipojo.Doc;
import com.ir.twilytics.apipojo.Tweet;
import com.ir.twilytics.apipojo.TweetResponse;
import com.ir.twilytics.service.QueryService;

@Controller
public class QueryController {

	@Autowired
	QueryService queryService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody String getTweets(@RequestParam("name") String query) {
		ModelMap model = new ModelMap();
		List<Doc> tweets = queryService.findAll(query);
		model.put("tweets", tweets);
		Gson jsonString = new Gson();
		return jsonString.toJson(tweets);
	}
}
