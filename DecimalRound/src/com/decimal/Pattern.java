package com.decimal;

public class Pattern {
	
//	a 
//	b c 
//	d e f 
//	g h i j 
//	k l m n o 
//	p q r s t u 
	
	public static void main(String args[]) {
		int a=97,r=7;
		for(int i=0;i<r-1;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(a++)+" ");
			}
			System.out.println();	
	}

	}
}

/*
char[] data={'A','B','C','D','E','F'};
for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(data[j]+" ");
			}
			System.out.println();	
	}

*/