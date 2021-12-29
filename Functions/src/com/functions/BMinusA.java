package com.functions;

public class BMinusA {
	public static void main(String args[]) {

		int a[] = {100,45,67,89,500,200};
		int b[] = {100,200,300,400,500,700,900};
		int[] ab=new int[b.length];
		int k=0,count=0;
		for(int j=0;j<b.length;j++){
		for (int i=0;i<a.length;i++){
		if(b[j]==a[i]){
		count++;
		}
		}
		if(count==0){
		ab[k]=b[j];
		k++;
		}
		else{
		count=0;
		}
		}
		for(int j=0;j<k;j++){
		System.out.println(ab[j]);
		}
		}
		}