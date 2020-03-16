package com.sonata;

public class Student {
	int stId;
	String stName;
	int stClass;
	
	public Student(int stId,String stName,int stClass)
	{
		this.stId = stId;
		this.stName = stName;
		this.stClass = stClass;
	}
	public void display()
	{
		System.out.println(stId+","+stName +","+stClass);

	}
	public static void main(String[] args) {
		Student s1=new Student(001,"Sagar",10);
		Student s2= new Student(002, "Abhi", 11);
		s1.display();
		s2.display();
	}

}
