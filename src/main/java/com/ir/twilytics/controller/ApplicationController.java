package com.ir.twilytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

	private static String WELCOME = "Welcome to my Searcher Application";

	@Autowired
	private DisplayAd response;

	@Autowired
	Operations operations;

	@RequestMapping("home")
	public String welcome() {// Welcome page, non-rest
		return WELCOME;
	}

	@RequestMapping("home/{name}")
	public String message(@PathVariable String name) {
		String msg = "Hello " + name;
		return msg;
	}

	@RequestMapping(method = RequestMethod.POST, value = "operation/getAd")
	public String getAdInfo(@RequestBody User user) {// Welcome page, non-rest
		response = operations.displayAd(user);
		Gson jsonString = new Gson();
		return jsonString.toJson(response);
	}

}
