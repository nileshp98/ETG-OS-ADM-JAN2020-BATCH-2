package com.sonata.DAO;

import java.util.List;

import com.sonata.Model.Product;

public interface PrdDAO {
	public int addProduct(Object obj);
	public int deleteProduct(Object obj);
	public int updateProduct(Object obj);
	public List<Product> displayProduct();
}