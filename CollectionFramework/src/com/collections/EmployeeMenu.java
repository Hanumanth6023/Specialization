package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class EmployeeMenu {
	
	 static Scanner scanner = new Scanner(System.in);
	    static List<Employee> empList = new ArrayList<Employee>();
	    public static void main(String[] args) {
	    int choice=0;
	        do {
	        System.out.println("Menu");
	        System.out.println("1.Create");
	        System.out.println("2.Search");
	        System.out.println("3.Update");
	        System.out.println("4.Delete");
	        System.out.println("5.DisplayData");
	        System.out.println("Exit(press -1)");


	        System.out.println("Please chose your choice");
	        choice = scanner.nextInt();
	        switch(choice){
	            case 1: 
	                    readEmpData();
	                    break; 
	                    
	            case 2: 
                        searchEmpData();
                        break;
	            case 3: 
                    updateEmpData();
                    break;
                        
	            case 4: 
                    deleteEmpData();
                    break;
                    
	            case 5 : System.out.println(empList); break;
	        }
	        }while(choice != -1);
	        System.out.println("Program ends");

	    }
	 
	    private static void updateEmpData() {
	    	int id;
	    	String empName;
	    	String dept;
	    	float salary;
	    	System.out.println("Enter the id you want to update");
	    	id = scanner.nextInt();
	    	System.out.println("Enter the empName");
	    	empName = scanner.next();
	    	System.out.println("Enter clg dept");
	    	dept = scanner.next();
	    	System.out.println("Enter clg salary");
	    	salary = scanner.nextFloat();
	    	
	    	for(int i = 0;i<empList.size();i++){
	    	Employee emp = empList.get(i);
	    	if(emp.getEmpId()==id){
	    	emp.setEmpName(empName);
	    	emp.setDept(dept);
	    	emp.setSalary(salary);
	    	}
	    	}			
		}

		private static void searchEmpData() {
	    	int ind=0;
	    	System.out.println("enter Emp id");
	        int id = scanner.nextInt();
	        
	        for ( ind = 0; ind < empList.size(); ind++) {
	        	Employee emp = empList.get(ind);
	        	if(emp.getEmpId()==id)
	        	System.out.println(emp);
	        	}

			
		}

		private static void readEmpData() {
	        System.out.println("enter Emp Name");
	        String name = scanner.next();

	        System.out.println("enter Emp ID");
	        int id = scanner.nextInt();

	        System.out.println("enter Emp Dept");
	        String dept = scanner.next();

	        System.out.println("enter Emp Salary");
	        float salary = scanner.nextFloat();

	        Employee newEmp = new Employee(name,id,dept,salary);

	        empList.add(newEmp);

	    }
		private static void deleteEmpData() {
	    	if(empList.size()==0) {
	    		System.out.println("no elements");
	    		
	    	}
	    	else {
	    	System.out.println("enter id");
	         int id= scanner.nextInt();
	    	for(int index=0;index<empList.size();index++) {
	    		Employee emp=empList.get(index);
	    		if(emp.getEmpId()==id)
	    			empList.remove(emp);
	    	}
	    	}
	    	
	    	System.out.println(empList);
	    }
	 
	}


