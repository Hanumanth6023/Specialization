package com.add;
import java.util.*;


public class ArrayRepeat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr=new int[30];
		
		System.out.println("Enter Size of array");
		int n=sc.nextInt();
		
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
		     arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j]) 
				{
					System.out.print(arr[j]);
					
				}
			}
			
		}
		
	}

}
