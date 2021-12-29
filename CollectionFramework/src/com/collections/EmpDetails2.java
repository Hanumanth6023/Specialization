package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpDetails2 {
	
	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
		EmpDetails[] e= new EmpDetails[10];
		int choice=0,c2=0,i=0;
        do {
        System.out.println("Menu");
        System.out.println("1.Create");
        System.out.println("2.display");
        System.out.println("3.raise sal");
        System.out.println("4. fetch");

        System.out.println("Exit(press -1)");


        System.out.println("Please chose your choice");
        choice = sc.nextInt();
        switch(choice){
        case 1: do {
            	System.out.println("1.clerk");
            	System.out.println("2.programmer");
            	System.out.println("3.manager");
            	System.out.println("4.Exit");
            	System.out.println("Enter your choice");
            	c2=sc.nextInt();
            	switch(c2)
            	{
            	case 1:e[i]=new Clerk1();
            	        i++;
            	        break;
            	case 2:e[i]=new Programmer1();
    	        i++;
    	        break;
            	case 3:e[i]=new Manager1();
    	        i++;
    	        break;
            	}
            	
            }while(c2!=4);
                    break;
                    
            case 2: try {
            	for(EmpDetails x:e)
            	{
            		if(x!=null)
            			x.display();
            	}
            }catch(Exception ex) {
            	System.out.println("No Records....");
            }break;
            	
            case 3:try {
            	for(EmpDetails x:e) {
            		if(x!=null) {
            			x.raise();
            		}
            	}
            		System.out.println("salary raised");
            	}catch (Exception ex) {
            		System.out.println("no records");
            	}
            	break;
            	
            	
            case 4:try {
            	System.out.println("Enter designation to feach");
            	String designation=sc.next();
            	for(EmpDetails x:e) {
          	       if(x.designation==designation) {
    	    	   
    	    	    x.display();
    	    	   
    	       }
            }
            }catch(Exception ex) {
            	System.out.println("no records");
            }break;
            
            
            	case 5:System.out.println("Exit...");
            	break;
            	default:System.out.println("Invalid choice");
            }
       
        }       while(choice!=4);
	}
}
                   