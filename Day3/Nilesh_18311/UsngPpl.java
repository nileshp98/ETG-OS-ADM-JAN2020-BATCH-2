package com.sonata.Assign3;

public class UsngPpl {
	public static void main(String args[])
	{
		Addresses a1=new Addresses();
		a1.setCity("bangalore");
		a1.setDoorNo(15);
		a1.setPin(560027);
		a1.setStreet("madhavan park");
		TechEmployee emp=new TechEmployee();
		emp.setBasicPay(13000);
		emp.setEmpId(123);
		emp.setEmpName("Nilesh");
		emp.setNol(5);
		emp.setObj(a1);
		emp.display();
		
		emp.calculateSalary();
		
		
	Staffs sf=new Staffs();
	sf.setBasicPay(10000);
	sf.setEmpName("Kiran");
	sf.setEmpId(18308);
	sf.calculateSalary();
	sf.display();
	}

}
