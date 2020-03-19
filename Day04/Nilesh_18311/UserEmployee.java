package com.sonata.EmployeeApplication;

import java.util.ArrayList;
import java.util.LinkedList;

public class UserEmployee {
	public static void main(String args[])
	 {
		 
		 LinkedList<Employee> ls= new LinkedList<Employee>();
		 Employee emp=new Employee(18306,"hampi",7000);
		 
		 
		 Employee emp1=new Employee(18318,"sonu",6000);
	
		 
		 Employee emp3=new Employee(18311,"bhagya",70000);
		
		
		ls.add(emp);
		ls.add(emp1);
		ls.add(emp3);
		 
		
		EmployeeImpl d1=new EmployeeImpl();
		d1.addEmployee(ls);
		d1.deleteEmployee(ls,emp);
		
		 
		double sal= d1.appSalary(emp3);
		System.out.println("App salary of employee = "+sal);
		
		d1.ObjectreadEmployee(ls);
		
		double sal1= d1.yearSalary(emp3);
		System.out.println("yearly salary of employee = "+sal1);
	 }

}
