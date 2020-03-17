package com.sonata.Assign3;

public class Triangle extends Shape {

	public Triangle(float l,float h) {
		super(l,h);
	}
	
	 public void calculateArea()
	 {
		 System.out.println("Area of Triangle is: "+(1.0/2.0)*length*height);
	 }
	
	
}
