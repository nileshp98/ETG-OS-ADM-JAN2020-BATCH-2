package com.sonata.Assign3;

public class Rectangle extends Shape {
	
	public Rectangle(float len,float width) {
		super(len,width);
	}
	 public void calculateArea()
	 {
		 System.out.println("Area of Rectangle is: "+length*width);
	 }
	
}
