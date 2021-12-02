package com.collections;

import java.util.*;

public class Example7 {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("One");
        ls.add("Two");
        ls.add("Three");
        ls.add("Four");
        ls.add("One");
        System.out.println("Before sorting  "+ls );
        LinkedHashSet<String> hs = new LinkedHashSet<>(ls);
        System.out.println("After sorting  unique values ");
        for(String strnumber : hs)
        System.out.println(strnumber);
    }
}
