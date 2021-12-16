package com.autowiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.required.Book;

public class MainSpellCheck {
    public static void main(String[] args) {
        ApplicationContext context = new
 ClassPathXmlApplicationContext("autowired.xml");
        SpellChecker sp1=new SpellChecker();
        TextEditor b1 = (TextEditor) context.getBean("textEditor");
       // System.out.println(b1.setSpellChecker(sp1));
        System.out.println(b1.getSpellChecker() );
    }
 }

