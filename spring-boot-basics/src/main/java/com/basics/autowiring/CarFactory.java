package com.basics.autowiring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CarFactory   {

	private ICar icar;
	
	 List<String> checkBrands(){
		 
		 return (new ArrayList<>()); 

	 }
	

}
