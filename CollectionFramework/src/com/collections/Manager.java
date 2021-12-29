package com.collections;

public class Manager extends Emp {
	
	double sal=23000;
	String designation="Manager";
	
	
	@Override
	public String toString() {
		return "Manager [sal=" + sal + ", designation=" + designation + "]";
	}
	public Manager(double sal, String designation) {
		super();
		this.sal = sal;
		this.designation = designation;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	

}
