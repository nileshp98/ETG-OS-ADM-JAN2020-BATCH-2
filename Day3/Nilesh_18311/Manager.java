package com.sonata.Assign3;

public class Manager extends Employee {

	double empSal=50000;
	Manager(int eid,String name)
	{
		super(eid,name);
	}
	public void display()
	{
		System.out.println("EmpID: "+empId+"\nName:"+empName+"\n Salary:"+empSal);
	}
	public void calSal() {
		System.out.println("Yearly salary :" +12*empSal);
	}
	
}
