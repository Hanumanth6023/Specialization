package com.add;

public class AMinusB {
	
	public static void main(String[] args) {
		
		int a[] = {100,45,67,89,500,200};
		int b[] = {100,200,300,400,500,700,900};
		
		int[] ab=new int[a.length];
		
		int k=0,count=0;
		
		for(int i=0;i<a.length;i++){
		for (int j=0;j<b.length;j++){
		if(a[i]==b[j]){
		count++;
		}
		}
		
		if(count==0){
		ab[k]=a[i];
		k++;
		}
		else{
		count=0;
		}
		}
		
		for(int i=0;i<k;i++){
		System.out.println(ab[i]);
		}
		
	}
}

