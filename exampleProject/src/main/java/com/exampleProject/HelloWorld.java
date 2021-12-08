package com.exampleProject;

public class HelloWorld {
	 private int id;  
	    private String ticketdate;  
	    public HelloWorld() {System.out.println("Ticket is "+ ticketdate);}  
	    public HelloWorld(int id) {this.id = id;}  
	    public HelloWorld(String ticketdate) {  this.ticketdate = ticketdate;}  
	    public HelloWorld(int id, String ticketdate) {  
	        this.id = id;  
	        this.ticketdate = ticketdate;  
	    }  
	    void display(){  
	        System.out.println(id+" "+ticketdate);  
	    }  
	}
