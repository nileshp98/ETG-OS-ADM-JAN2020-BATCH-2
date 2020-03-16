package com.sonata;

public class Product {
	int prdId;
	String prdName;
	float prdPrice;
	double totalPrice;
	
	public Product(int prdId,String Name,float price)
	{
		this.prdId=prdId;
		this.prdName=Name;
		this.prdPrice= price;
		totalPrice=price+(price*.18);
	}
	public void display()
	{
		System.out.println(prdName+" "+ totalPrice);
	}
	
	public static void main(String[] args) {
	
		Product p1=new Product(001,"Skoda",10);
		p1.display();
		
	}

}
