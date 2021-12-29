package com.collections;

import java.util.Scanner;

abstract class EmpDetails{
	
	
	String name;
	int age;
	double sal;
	String designation;
	
	Scanner sc=new Scanner(System.in);
	
	public EmpDetails() {
		
		System.out.println("\nEnter name of emp");
    	name=sc.next();
    	System.out.println("Enter age");
    	age=sc.nextInt();
	}
	
	public void display() {
		System.out.println("\n name of emp"+name);
		System.out.println("\n age of emp"+ age);
		System.out.println("\n salary of emp"+sal);
		System.out.println("\n designation of emp"+designation);
		
		
	}
	
	public abstract void raise() ;

		
}
	
    final class Clerk1 extends EmpDetails
    {
	 public Clerk1() {
		 sal=8000;
		 designation="clerk";
		 
	 }
	 
	 public void raise() {
		 sal+=1000;
	 }
    }
	
    final class Programmer1 extends EmpDetails
    {
	 public Programmer1() {
		 sal=20000;
		 designation="programmer";
		 
	 }
	 
	 public void raise() {
		 sal+=5000;
	 }
    }
	
    final class Manager1 extends EmpDetails
    {
	 public Manager1() {
		 sal=15000;
		 designation="Manager";
		 
	 }
	 
	 public void raise() {
		 sal+=7000;
	 }
    }

