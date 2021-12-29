package com.collections;

public class Employee {
	
	private String empName;
    private int empage;
    private float salary;
    private String designation;
   
    
    
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empage + ", dept=" + designation + ", salary=" + salary + "]";
	}
	public Employee(String empName, int empId, String dept, float salary) {
		super();
		this.empName = empName;
		this.empage = empId;
		this.designation = dept;
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empage;
	}
	public void setEmpId(int empId) {
		this.empage = empId;
	}
	public String getDept() {
		return designation;
	}
	public void setDept(String dept) {
		this.designation  = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}
