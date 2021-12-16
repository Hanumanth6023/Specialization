package com.app.spring.Spring.carexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Manufacture {

		@Autowired
		Car car1;
		
	public void buildCar() {
			
	
		car1.demo();
		
		
		}
		

}
