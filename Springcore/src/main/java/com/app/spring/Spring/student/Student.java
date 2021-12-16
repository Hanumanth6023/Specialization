package com.app.spring.Spring.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	@Qualifier("social")
	Teacher teacher1;
	
public void Teacherdetails() {
		
	teacher1.name();
	teacher1.teach();
	
	}
	

}
