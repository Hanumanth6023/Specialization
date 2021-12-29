package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentMenu {
	
	
	static Scanner sc = new Scanner(System.in);
    static List<Student> stu = new ArrayList<Student>();
    public static void main(String[] args) {
    int choice=0;
        do {
        System.out.println("Menu");
        System.out.println("1.Create");
        System.out.println("2.Search");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        System.out.println("5.DisplayData");
        System.out.println("6.Exit");


        System.out.println("Please chose your choice");
        choice = sc.nextInt();
        switch(choice){
            case 1: 
                    readStudent();
                    break; 
            case 2:
            	    searchStudent();
            	    break;
            case 3:
            	    updateStudent();
            	    break;
            	    
           case 4:removeStudent();
                  break;
            	    
            case 5 : System.out.println(stu); break;
        }
        }while(choice != 6);
        
        System.out.println("Program ends");

    }
 
    private static void readStudent() {
        System.out.println("enter Student Name");
        String name = sc.next();

        System.out.println("enter Student ID");
        int id = sc.nextInt();

        System.out.println("enter Student clg name");
        String clgname = sc.next();

        System.out.println("enter clg loc");
        String clgloc = sc.next();

        Student newStudent = new Student(name,id,clgname,clgloc);

        stu.add(newStudent);

    }
    
    public static void searchStudent() {
    	System.out.println("enter id");
        int id= sc.nextInt();
    	for (int ind = 0; ind < stu.size(); ind++) {
    	Student stud = stu.get(ind);
    	if(stud.getId()==id)
    	System.out.println(stud);
    	}
    	}
    
    
    public static void updateStudent(){
    	int id;
    	String name;
    	String clgname;
        String clgloc;
    	System.out.println("Enter the id you want to update");
    	id = sc.nextInt();
    	System.out.println("Enter the name");
    	name = sc.next();
    	System.out.println("Enter clg name");
    	clgname = sc.next();
    	System.out.println("Enter clg loc");
    	clgloc = sc.next();
    	for(int i = 0;i<stu.size();i++){
    	Student s = stu.get(i);
    	if(s.getId()==id){
    	s.setName(name);
    	s.setClgname(clgname);
    	s.setClgloc(clgloc);
    	}
    	}
    	}
    
    
    private static void removeStudent() {
    	if(stu.size()==0) {
    		System.out.println("no elements");
    		
    	}
    	else {
    	System.out.println("enter id");
         int id= sc.nextInt();
    	for(int index=0;index<stu.size();index++) {
    		Student stud=stu.get(index);
    		if(stud.getId()==id)
    			stu.remove(stud);
    	}
    	}
    	
    	System.out.println(stu);
    }
    
    
    
}
