package com.functions;

import java.util.Scanner;

public class PerfectNumber {
	
	static int perfect(int num) {
		
		int sum=0;
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
				
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();	
		
		int s=perfect(n);
		
		if(s==n)
			System.out.println(n+"Perfect Number");
		
		else
			System.out.println(n+"is not Perfect Number");

	}


}
