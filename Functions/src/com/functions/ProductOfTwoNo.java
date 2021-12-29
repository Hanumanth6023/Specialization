package com.functions;

import java.util.Scanner;

public class ProductOfTwoNo {
	
	public static void main(String[] args) {
		
		product();
		
	}
	
	static int product() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		int res = n1*n2;
		System.out.println(res);
		return res;
		
	}


}
