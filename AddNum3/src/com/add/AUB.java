package com.add;

public class AUB {

	public static void main(String[] args) {

		        int a[] = {100,45,67,89,500,200};// 6 7
		        int b[] = {100,200,300,400,500,700,900};
		        int[] aub = new int[a.length+b.length];
		        // AUB...A^B...A-B
		        //AUB=====100,45,67,89,500,200,
		        //300,400,700,900
		        boolean elePresent;
		        int aubIndex = 0;
		        
		        //for A elements copy to aub
		        for(int i=0;i<a.length;i++) {
		            aub[aubIndex++] = a[i];
		        }
		        // 6
		        for(int j=0;j<b.length;j++) {
		            elePresent =  isElementPresent(aub,b[j]);
		            if(elePresent == false) {
		                aub[aubIndex++] = b[j];
		            }

		        }

		        for(int i=0;i<aubIndex;i++) {
		            System.out.print(aub[i]+" ");
		        }



		    }

		    static boolean isElementPresent(int[] ab,int target) {//  100,45,67,89,500,200, ..... 300
		        boolean res = false;

		        for(int i=0;i<ab.length;i++) {
		            if(ab[i] == target) {
		                res = true;
		                break;
		            }//if
		        }//for

		        return res;
		    }
		 
		}
