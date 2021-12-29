package com.collections;

import java.util.ArrayList;

public class Example5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println("Array list 1 are "+arr);
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);

        System.out.println("Array list 2 are "+arr);
        arr.removeAll(arr2);
        System.out.println("after the removing the elements  "+arr);
    }

}