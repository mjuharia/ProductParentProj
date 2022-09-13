package com.moso.product.bo;

import com.moso.product.dto.Product;

public interface ProductBO {
	void create(Product product);
	
	Product findProduct(int id);
	

}
