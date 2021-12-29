package com.functions;

import java.util.Scanner;

public class SumOfTwoNum {

	public static void main(String[] args) {
		sum();
	}
	
	static void sum() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		
		System.out.println(n1+n2);
	}

}
