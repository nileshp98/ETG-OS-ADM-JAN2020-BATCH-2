package com.sonata.Assign3;

public class Developer extends Employee {
	double empSal=30000;
	Developer(int eid,String name)
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
