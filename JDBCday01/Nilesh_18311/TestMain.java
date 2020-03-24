package com.sonata.TestMain;

import java.util.ArrayList;
import java.util.List;

import com.sonata.DAOImpl.PrdDAOImpl;
import com.sonata.Model.Product;


public class TestMain {
	public static void main(String[] args) {
			Product p1 = new Product();
			p1.setPrdID(1004);
			p1.setPrdName("Regulator Pipe");
			p1.setPrdPrice(150); 
			
			PrdDAOImpl dao = new PrdDAOImpl();
			int row = dao.addProduct(p1);
			System.out.println(row);
			
			Product p2 = new Product();
			p2.setPrdID(201);
			
			row = dao.deleteProduct(p2);
			
			Product p3 = new Product();
			p3.setPrdID(1004);
			
			 row = dao.updateProduct(p3);
			List<Product> al= new ArrayList<Product>();
			al = dao.displayProduct();
			
			System.out.println(al);
			

		}

}
