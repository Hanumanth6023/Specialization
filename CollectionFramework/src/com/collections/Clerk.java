package com.collections;

public class Clerk extends Emp {
	
	
	double sal=25000;
	String designation="Clerk";

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
	public Clerk(double sal, String designation) {
		super();
		this.sal = sal;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Clerk [sal=" + sal + ", designation=" + designation + "]";
	}
	

}
