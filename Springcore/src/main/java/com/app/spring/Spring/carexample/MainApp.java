package com.app.spring.Spring.carexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.spring.Spring.car.CarConfig;

public class MainApp {
	
	public static void main(String ars[]) {
	
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
         Manufacture man= context.getBean("manufacture",Manufacture.class);
         man.buildCar();
	}
}
