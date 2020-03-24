package com.sonata.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.sonata.DAO.PrdDAO;
import com.sonata.Model.Product;
import java.sql.*;

public class PrdDAOImpl implements PrdDAO {
	int row= 0;
	DBConnection db = new DBConnection();
	Product product= null;
	@Override
	public int addProduct(Object obj) {
		ArrayList<Product> pl = new ArrayList<Product>();

		try
		{
			product =(Product) obj;
			PreparedStatement ps= (PreparedStatement) db.getConnection().prepareStatement("Insert into ProductDetails values (?,?,?)");
			ps.setInt(1, product.getPrdID());
			ps.setString(2, product.getPrdName());
			ps.setDouble(3, product.getPrdPrice());
			row = ps.executeUpdate();
			
			db.closeConnection();
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return row;
	}
	@Override
	public int deleteProduct(Object obj) {

		try
		{
			product =(Product) obj;
			PreparedStatement ps= (PreparedStatement) db.getConnection().prepareStatement("Delete from ProductDetails where prdId= ?");
			ps.setInt(1, product.getPrdID());
			
			row = ps.executeUpdate();
			db.closeConnection();
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return row;
		
	}
	@Override
	public int updateProduct(Object obj) {
		
		try
		{
			PreparedStatement ps= (PreparedStatement) db.getConnection().prepareStatement("update productdetails set prdprice =? where prdId=?");
			ps.setDouble(1, 200);
			ps.setInt(2, 1004);
			
			int row = ps.executeUpdate();
			System.out.println("The number of records updated are :"+row);
		}
		catch (SQLException e) {
			e.printStackTrace();
			
		}
		return row;
		}
	@Override
	public List<Product> displayProduct() {
		List l1 =new  ArrayList<Product>();
		try
		{
			PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement("SELECT * FROM Productdetails");
			ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{ 
			 Product prd= new Product();
			
			prd.setPrdID(rs.getInt(1));
			prd.setPrdName(rs.getString(2));
			prd.setPrdPrice(rs.getDouble(3));
			l1.add(prd);
		}
		
	}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		return l1;
	}

	
		
		
	}


