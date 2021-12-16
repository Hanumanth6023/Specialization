package com.app.spring.Spring.student;

import org.springframework.stereotype.Component;

@Component
public class Social implements Teacher{

	public void name() {
		
		System.out.println("Teacher name is Gopi");
		
	}

	public void teach() {
		
		System.out.println("Teaches Social");
	}

}
