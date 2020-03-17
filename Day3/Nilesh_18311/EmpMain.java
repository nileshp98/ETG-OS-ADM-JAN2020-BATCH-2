package com.sonata.Assign3;

public class EmpMain {

	public static void main(String[] args) {

		Manager m1=new Manager(111, "Nilesh");
		m1.display();
		m1.calSal();
		
		Developer d1= new Developer(112, "Kiran G");
		d1.display();
		d1.calSal();
		
		Tester t1= new Tester(113, "Rahul S");
		t1.display();
		t1.calSal();
		
		
	}

}
