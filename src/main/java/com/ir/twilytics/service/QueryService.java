package com.ir.twilytics.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ir.twilytics.apipojo.Doc;
import com.ir.twilytics.apipojo.Tweet;
import com.ir.twilytics.apipojo.TweetResponse;

@Service
public class QueryService {

	private static List<Tweet> tweets = new ArrayList<Tweet>();
    private static int todoCount = 3;
    static {
        
    }
    
    public List<Tweet> retrieveTweets(String query) {
        List<Tweet> filteredTweets = new ArrayList<Tweet>();
        for (Tweet tweet : tweets) {
            if (true) {
                
            }
        }
        return filteredTweets;
    }
    
    
    @Value("${resource.tasks}")
    private String resource;
    @Value("${resource.tasks}/{id}")
    private String idResource;
    @Autowired
    private RestTemplate restTemplate;

    public List<Doc> findAll(String query) {
    	String url = resource + "q=full_text:("+query+")&rows=100";
    	System.out.println("urls is : "+url);
    	List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
    	messageConverters.add(new FormHttpMessageConverter());
    	messageConverters.add(new StringHttpMessageConverter());
    	messageConverters.add(new GsonHttpMessageConverter());
    	restTemplate.setMessageConverters(messageConverters);
        TweetResponse tweetResponse =  restTemplate.getForObject(url, TweetResponse.class);
        if(!Objects.isNull(tweetResponse) && tweetResponse.getResponse()!=null && tweetResponse.getResponse().getDocs()!=null)
        {
        	return tweetResponse.getResponse().getDocs();
        }
        else {
        	return new ArrayList<Doc>();
        }
    }
    
    public List<Doc> findAllTweets(String query) {
    	String url = resource + "q=full_text:("+query+")&rows=100";
    	System.out.println("urls is : "+url);
    	List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
    	messageConverters.add(new FormHttpMessageConverter());
    	messageConverters.add(new StringHttpMessageConverter());
    	messageConverters.add(new GsonHttpMessageConverter());
    	restTemplate.setMessageConverters(messageConverters);
        TweetResponse tweetResponse =  restTemplate.getForObject(url, TweetResponse.class);
        if(!Objects.isNull(tweetResponse) && tweetResponse.getResponse()!=null && tweetResponse.getResponse().getDocs()!=null)
        {
        	return tweetResponse.getResponse().getDocs();
        }
        else {
        	return new ArrayList<Doc>();
        }
    }
    

}
