package com.sonata;

public class TShirt {
	String color;
	String material;
	String design;
	
	 TShirt(String color,String material,String design)
	{
		this.color=color;
		this.material=material;
		this.design=design;
	}
	TShirt()
	{
		
	}
	TShirt(String exLa,String mate)
	{
		
	}
	public void display()
	{
		System.out.println("Tshirt is having color "+color+" and made up of "+material+" design "+design);
	}

	public static void main(String[] args) {
			TShirt small= new TShirt("Red","Cotton","Polo");
			TShirt medium=new TShirt("Green", "polyster", "Round Neck");
			TShirt ex_large=new TShirt("Black", "Cotton", "Polo");
			small.display();
			medium.display();
			ex_large.display();
	}

}
