package com.sonata.Assign3;

public class Shape {
	float length;
	float height;
	float width;
	public Shape(float l)
	{
		this.length=l;
	}
	public Shape(float l,float w)
	{
		this.length=l;
		this.width=w;
		this.height=w;
		
	}
	
	public Shape(float l,float h,float w)
	{
		this.length=l;
		this.height=h;
		this.width=w;
	}
	
	public void calculateArea()
	{
		System.out.println("Area is Calculated");
	}

}
