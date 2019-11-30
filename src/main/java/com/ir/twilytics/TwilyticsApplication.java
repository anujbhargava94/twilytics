package com.ir.twilytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

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
	@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
	public QueryBuilder getQueryBuilder()
	{
		return new SolrQueryBuilder();
	}

}
