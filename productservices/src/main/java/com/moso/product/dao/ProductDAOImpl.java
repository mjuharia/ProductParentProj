package com.moso.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.moso.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {
	
	Map<Integer, Product> Products = new HashMap();

	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		Products.put(product.getId(), product);
		

	}

	@Override
	public Product read(int id) {
		// TODO Auto-generated method stub
		return Products.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
