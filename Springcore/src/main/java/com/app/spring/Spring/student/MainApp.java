package com.app.spring.Spring.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.spring.Spring.student.Student;
import com.app.spring.Spring.student.StudentConfig;
public class MainApp {

	public static void main(String[] args) {
		

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
	      context.getBean("student",Student.class).Teacherdetails();
	       
	}

}
