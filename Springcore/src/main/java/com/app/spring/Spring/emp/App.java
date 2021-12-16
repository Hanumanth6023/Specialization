package com.app.spring.Spring.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.spring.Spring.emp.Employee;
import com.app.spring.Spring.emp.EmployeeConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
       Employee employee=(Employee) context.getBean("employee");
       employee.details();
        
    }
}
