package myOwnAutoShopProject;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan s1=new Sedan(10000,"Red",.05,20);
		System.out.println("Sedan Details: --------------------");
		s1.display();
		
		System.out.println("Ford  Details: --------------------\n\n");
		
		Ford f1=new Ford(50000,"Black",0.12,0.05);
		f1.display();
		
		Ford f2 =new Ford (800000,"White",0.15,0.05);
		f2.display();
		
		System.out.println("Car Details: --------------------\n\n");
		Car c1=new Car(200000, "Maroon", 0.15);
		c1.display();
	}

}
