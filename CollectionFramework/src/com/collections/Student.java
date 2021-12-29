package com.collections;

public class Student {
	
	String name;
	int id;
	String clgname;
	String clgloc;
	
	
	public Student(String name, int id, String clgname, String clgloc) {
		super();
		this.name = name;
		this.id = id;
		this.clgname = clgname;
		this.clgloc = clgloc;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", clgname=" + clgname + ", clgloc=" + clgloc + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public String getClgloc() {
		return clgloc;
	}
	public void setClgloc(String clgloc) {
		this.clgloc = clgloc;
	}

}
