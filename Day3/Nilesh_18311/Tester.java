package com.sonata.Assign3;

public class Tester extends Employee {
	
	double empSal=35000;
	Tester(int eid,String name)
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
