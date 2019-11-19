package com.ir.twilytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ir.twilytics")
public class TwilyticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwilyticsApplication.class, args);
	}

}
