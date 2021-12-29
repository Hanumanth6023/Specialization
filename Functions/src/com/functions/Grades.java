package com.functions;

import java.util.Scanner;

public class Grades {
	
	static void grades(){
	int marks;
    Scanner sc=new Scanner(System.in);
    
    while(true){
    	
    System.out.println("Enter Marks");
    marks=sc.nextInt();
    
    if(marks>90 && marks<=100){
        System.out.println("AA Grade");
    }
    
    else if(marks>80 && marks<=90)
    {
	System.out.println("AB Grade");
    }
    
    else if(marks>70 && marks<=80)
    {
	System.out.println("BB Grade");
    }
    
    else if(marks>60 && marks<=70)
    {
	System.out.println("BC Grade");
    }
    
    else if(marks>=50 && marks<=60)
    {
	System.out.println("CD Grade");
    }
    
    else if(marks>40 && marks<=50)
    {
	System.out.println("DD Grade");
    }
    
    else if(marks<=40)
    {
	System.out.println("FAIL");
    }
    
    else System.out.println("Enetr below 101 Marks");
    
 }
}
	
public static void main(String[] args) {
		
		grades();
		
	}
}



