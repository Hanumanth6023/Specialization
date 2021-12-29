package com.collections;

import java.util.HashMap;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("hanu",10);
        map.put("ram",30);
        map.put("veera",90);
        map.put("vasanth",60);
        map.put("mahesh",20);
        System.out.println(map);
//        System.out.println("enter the name to be searched get key");
//        Scanner sc = new Scanner(System.in);
//        String ved = sc.next();
//        if (map.containsKey(ved)){
//            Integer a = map.get(ved);
//            System.out.println("value for key  " +ved+  " is " +a);
//        }
//        else
//        {
//            System.out.println("wrong choice ");
//        }
    }
}
