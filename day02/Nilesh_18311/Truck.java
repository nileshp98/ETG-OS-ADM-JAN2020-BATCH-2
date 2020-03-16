package myOwnAutoShopProject;

public class Truck extends Car {
	
	int weight;
	double n;
	
	Truck (double price,String color,double sale,int wt)
	{
		super(price,color,sale);
		this.weight=wt;

		this.weight=weight;
	}
	double getSalePrice()
	{
		double salePrice;
		if (weight >2000)
		{
		  sale= 0.10;
		}
		else
		{
		 sale=0.20;		
		}
		cost = regularPrice-regularPrice*sale;
		 salePrice=regularPrice*sale;
		 System.out.println("Sale Price for this Truck is: "+salePrice);
		 return cost;
	}

}
