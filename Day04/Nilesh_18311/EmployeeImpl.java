package com.sonata.EmployeeApplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;



public class EmployeeImpl implements EmployeeInt {
	
	public void addEmployee(LinkedList ls)
	{
	
		System.out.println(ls);
		
		
		
		
	}
	public void deleteEmployee(LinkedList l1,Employee e1)
	{
		
		
		    l1.remove(e1);
			System.out.println(l1);
	}
	public double appSalary(Employee e)
	{
		if(e.empSal<10000)
		{
			e.empSal=e.empSal+5000;
		}
		return e.empSal;
	}
	
	public double yearSalary(Employee e2)
	{
		return e2.empSal*12;
	}
	@Override
	public void ObjectreadEmployee(LinkedList<Employee> ls) {
		Iterator itr = ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
	}
