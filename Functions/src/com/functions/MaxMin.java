package com.functions;

import java.util.Scanner;

public class MaxMin {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		
		System.out.println("Enter third number");
		int n3 = sc.nextInt();
		
		
		
		MaxMin obj=new MaxMin(); 
		System.out.println(obj.maximum(n1,n2,n3));
		
		System.out.println(obj.minimum(n1,n2,n3));
		
	}
		
	
	
		 int maximum(int n1,int n2,int n3)
		{
			
				
		int m=Math.max(n1, n2);
		return Math.max(m,n3);
		//System.out.println("max number"+ " "+ m);
		
		
		}
		
		
		
	    int minimum(int n1,int n2, int n3) {
			
		int mini=Math.min(n1, n2);
		return Math.min(mini,n3);
		//System.out.println("Enter min number" + " "+ mini);
		
		}

	


}
