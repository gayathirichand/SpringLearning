package com.spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	// bean definitions - methods that create and return objects
	// annotate with @Bean - the bean name will be the method name
	@Bean
	@Primary

	Action action() {
		return new Action();
	}

	@Bean
	Thriller getThriller() { 
		return new Thriller();
	}

	@Bean
	Comedy comedy() {  //comedy is the bean name 
		return new Comedy();
	}
	@Bean
	Theatre theatre() {
		return new Theatre();
	}
}
