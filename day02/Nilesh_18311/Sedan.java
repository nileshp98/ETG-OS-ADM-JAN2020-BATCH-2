package myOwnAutoShopProject;

public class Sedan extends Car {
	
	int length;
	
	Sedan(double price,String color,double sale,int length)
	{
		super(price,color,sale);
		this.length=length;
	}
	double getSalePrice()
	{
		
		if(length > 20)
			sale=.05;
		else
			sale=0.10;
		
		cost=regularPrice-regularPrice*sale;
		System.out.println("sale price for Sedan is :"+regularPrice*sale);
		return cost;
		
	}
	public void display()
	
	{
		System.out.println("Sedan price with discount:"+getSalePrice());
		System.out.println("Color:"+ color);
		System.out.println();
	}

}
