package com.exampleProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

public static void main(String[] args) {
ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
HelloWorld t1=(HelloWorld)context.getBean("ticket");  
     t1.display();  
}
}
