package com.spring.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// create the IOC container - 2 IOC --> Application context sub interface of BeanFactory
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.examples");
		
		//get  the bean from the IOC container 
        Employee employee = (Employee)context.getBean("employee");
        System.out.println(employee);

	}

}
