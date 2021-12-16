package com.app.spring.Spring.car;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
		
	}

}
