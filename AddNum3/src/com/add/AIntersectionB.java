package com.add;

public class AIntersectionB {
	
	public static void main(String args[]) {
	int i=0,j=0;
	int a[] = {100,45,67,89,500,200};
    int b[] = {100,200,300,400,500,700,900};
   
    while(i<a.length && j<b.length){
    	
    	if(a[i]<b[j])
    		i++;
    	else if (b[j]<a[i])
    		j++;
    	else
    		System.out.println(b[j++]+" ");
    	i++;
    	
    }
}

}
