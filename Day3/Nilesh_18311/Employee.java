package com.sonata.Assign3;

public class Employee {

	int empId;
	String empName;
	double empSal;
	public Employee(int eid,String name) {
		this.empId=eid;
		this.empName=name;

	}
	
	public void display()
	{
		System.out.println("EmpID: "+empId+"\nName:"+empName+"\n Salary:"+empSal);
	}
	public void calSal() {
		System.out.println("Yearly salary :" +12*empSal);
	}
	
	
	
	
	
}
