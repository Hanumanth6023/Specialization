package com.array;

class CommArray {
	
	public void comm(int ar1[],int ar2[],int ar3[]) {
		int i=0,j=0,k=0;
		while(i<ar1.length && j<ar2.length && k< ar3.length) {
					
		 if(ar1[i]==ar2[j] && ar2[j]==ar3[k]) {
			 
			 System.out.print(ar1[i]+"");
			 i++;
			 j++;k++;
				
			}
		 
		 else if(ar1[i]<ar2[j]) {
			 
			 i++;
		 }
			 
		 
		 else if(ar2[j]<ar3[k])
			 j++;
			
		else
			k++;
	}
	}	

	public static void main(String[] args) {
		
		CommArray obj=new CommArray();
		int ar1[]= {12, 35, 100, 120,180,240, 380};
		int ar2[]={56, 110, 120, 180, 5600};
		int ar3[]={33, 44,  120, 180, 1120};
		
		System.out.print("common elements are"+" ");
		obj.comm(ar1,ar2,ar3);
		
	}

}
