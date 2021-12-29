package com.functions;

import java.util.Scanner;

public class Factorial {

	static long factorial(long n) {
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}
	
	public static void main(String[] args) {
		long fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		long num = sc.nextLong();	
		fact=factorial(num);
		
		System.out.println("Factorial of"+" " + num +" "+ "is"+"  "+fact);

	}

}
