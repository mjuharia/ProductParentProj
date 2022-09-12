package com.moso.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.moso.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		
		product.setId(1);
		product.setDescription("This is a cool product");
		product.setName("iPhone");
		product.setPrice(800);
		
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		
		assertEquals("iPhone", result.getName());
		
	}

}
