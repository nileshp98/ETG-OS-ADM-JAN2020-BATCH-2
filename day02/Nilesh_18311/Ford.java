package myOwnAutoShopProject;

public class Ford extends Car {
	int year;
	double manufacturerDiscount=0.10;
	
	Ford (double price,String color,double sale,double manDisc)
	{
		super(price,color,sale);
		this.manufacturerDiscount=manDisc;
	}
	double getSalePrice()
	{
		
		double cost = super.getSalePrice();
		cost = cost- cost*manufacturerDiscount;
		System.out.println("Manufacturer Discount:"+cost*manufacturerDiscount);
		return cost;
	}
	public void display()
	
	{
		System.out.println("Ford price with discount:"+getSalePrice());
		System.out.println("Color:"+ color);
		System.out.println();
	}

}
