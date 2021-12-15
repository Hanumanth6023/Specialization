package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class Student {
	
	
	public String demo() {
		
		System.out.println("Welcome");
		return null;
		
	}
	

	
	
}
