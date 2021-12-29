package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CollectionTypes {

	public static void main(String[] args) {
		
		LinkedList x = new LinkedList<>();
		
		x.add("one");
		x.add("two");
		x.add("one");
		
		System.out.println(x.poll());
		

	}

}
