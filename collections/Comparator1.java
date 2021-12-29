package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Comparator1 {

	static List<Product> product = new ArrayList<Product>();
	public static void main(String[] args) {
		
	product.add(new Product(1,"Soap",1,60));
	product.add(new Product(2,"Shampoo",1,80));
	product.add(new Product(3,"Pencil",1,5));
	product.add(new Product(4,"Pen",1,10));
	product.add(new Product(5,"Eraser",1,30));

	// Sort employees by Name
    Comparator<Product> productNameComparator = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getProduct_name().compareTo(p2.getProduct_name());
        }
    };


    /*
    The above Comparator can also be written using lambda expression like so =>
    employeeNameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
    Which can be shortened even further using Java 8 Comparator default method
    employeeNameComparator = Comparator.comparing(Employee::getName)
    */
    Collections.sort(product, productNameComparator);
    System.out.println("\n Products (Sorted by Name) : " + product);
    
    
    // Sort employees by Salary
    Comparator<Product> productPriceComparator = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            if(p1.getPrice() < p2.getPrice()) {
                return -1;
            } else if (p1.getPrice() > p2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    };
    Collections.sort(product, productPriceComparator);
    System.out.println("\nProduct (Sorted by Price) : " + product);
    
    
    // Sort employees by JoiningDate
    Comparator<Product> productQtyComparator = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
        	 if(p1.getQty() < p2.getQty()) {
                 return -1;
             } else if (p1.getQty() > p2.getQty()) {
                 return 1;
             } else {
                 return 0;
             }
         }
     };
    Collections.sort(product, productQtyComparator);
    System.out.println("\nProduct (Sorted by Qty) : " + product);

}
}

