package com.collections;

public class Programer extends Emp{
	
	double sal=25400;
	String designation="Programmer";
	
	
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
	public Programer(double sal, String designation) {
		super();
		this.sal = sal;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Programer [sal=" + sal + ", designation=" + designation + "]";
	}

	
}
