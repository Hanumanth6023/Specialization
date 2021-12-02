package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<>();
		List<Object> l2 = l1;
		l2.add(new Integer(12));
		System.out.println(l2.size());
		

	}

}
