package com.ir.twilytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.ir.twilytics.dao.QueryBuilder;
import com.ir.twilytics.daoImpl.SolrQueryBuilder;

@SpringBootApplication
@ComponentScan("com.ir.twilytics")
public class TwilyticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwilyticsApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@Bean
	public QueryBuilder getQueryBuilder()
	{
		return new SolrQueryBuilder();
	}

}
