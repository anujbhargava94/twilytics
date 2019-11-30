package com.ir.twilytics.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class QueryUtils {

	public static Long getPoiId(String poiName) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void initialiseRestTemplate(RestTemplate restTemplate) {
		// TODO Auto-generated method stub
		// Add the Jackson Message converter
				MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

				// Note: here we are making this converter to process any kind of response,
				// not only application/*json, which is the default behaviour
				converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
				List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
				messageConverters.add(new FormHttpMessageConverter());
				messageConverters.add(new StringHttpMessageConverter());
				messageConverters.add(new GsonHttpMessageConverter());
				messageConverters.add(converter);
				restTemplate.setMessageConverters(messageConverters);
	}
	
	

}
