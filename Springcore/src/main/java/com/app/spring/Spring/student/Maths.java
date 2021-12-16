package com.app.spring.Spring.student;
import org.springframework.stereotype.Component;

@Component

public class Maths implements Teacher{

	public void name() {
		
		System.out.println("Teacher name is Geeta");
		
	}

	public void teach() {
		
		System.out.println("Teaches mathametics");
		
	}
	
	
	
	

}
