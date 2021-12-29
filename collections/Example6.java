package com.collections;


import java.util.ArrayList;

import java.util.Collections;


public class Example6 {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("Seenu");
        ls.add("Ankith");
        ls.add("Kiran");
        ls.add("Ravi");
        ls.add("Sujan");
        System.out.println("Before sorting  "+ls );
        Collections.sort(ls);
        System.out.println("After sorting  "+ls);
    }
}