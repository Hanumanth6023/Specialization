package com.decimal;

public class Pattern9 {
	
public static void main(String[] args) {
//	
//	*****
//	 ****
//	  ***
//	   **
//	    *
		
		int i,r=5;
		for( i=r;i>=1;i--) {

		for(int j=r;j>i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
}
