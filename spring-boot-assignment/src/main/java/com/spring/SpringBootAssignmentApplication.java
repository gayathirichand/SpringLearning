package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.javabased.Theatre;

@SpringBootApplication(scanBasePackages = "com.spring.javabased")
public class SpringBootAssignmentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignmentApplication.class, args);
	};
	
//	private Restaurant restaurant;

//	@Autowired
//	public void setRestaurant(Restaurant restaurant) {
//		this.restaurant = restaurant;
//	}

	@Autowired
	private Theatre theatre;
	
	
	@Override
	public void run(String... args) throws Exception {
   
		 theatre.showMovie().forEach(System.out::println);
	
	
	}
	
	
}
