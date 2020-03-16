package myOwnAutoShopProject;

public class Car {
	int speed;
	double regularPrice;
	String color;
	double sale;
	double cost;
	
	Car(double reg,String c,double sal)
	{
		this.regularPrice=reg;
		this.color=c;
		this.sale=sal;
	}
	Car()
	{
		
	}
	
	double getSalePrice()
	{
		 cost=regularPrice- regularPrice*sale;
		 double salePrice=regularPrice*sale;
		 System.out.println("Sale Price is:"+ salePrice);
		return cost;
	}
	public void display()
	
	{
		System.out.println("Car price with discount:"+getSalePrice());
		System.out.println("Color:"+ color);
		System.out.println();
	}
}
