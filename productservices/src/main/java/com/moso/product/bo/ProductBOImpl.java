package com.moso.product.bo;

import com.moso.product.dao.*;
import com.moso.product.dto.*;

public class ProductBOImpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		
		return dao.read(id);
	}

}
