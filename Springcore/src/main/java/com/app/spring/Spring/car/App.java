package com.app.spring.Spring.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.spring.Spring.emp.EmployeeConfig;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		Car car = context.getBean("car",Car.class);
		car.setName("Hundai");
		System.out.println(car.getName());
		
	}

}
