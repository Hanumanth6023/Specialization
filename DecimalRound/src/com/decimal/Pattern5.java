package com.decimal;

public class Pattern5 {
	
//	     * 
//     * * 
//   * * * 
// * * * * 
//* * * * *
	public static void main(String[] args) {
		
		int i,r=6;
		for( i=1;i<r;i++) {
			
			for(int j=2*(r-i);j>=0;j--) {
				
				System.out.print(" ");
			}
			

		for(int j=1;j<=i;j++) {
			System.out.print("*"+" ");
			
			
		}
		System.out.println();
	}

}
}