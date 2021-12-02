package com.collections;


import java.util.ArrayList;

import java.util.Collections;


public class Example6 {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("Sri");
        ls.add("Anil");
        ls.add("Kiran");
        ls.add("Ravi");
        ls.add("Sujan");
        ls.add("Veda");
        System.out.println("Before sorting  "+ls );
        Collections.sort(ls);
        System.out.println("After sorting  "+ls);
    }
}