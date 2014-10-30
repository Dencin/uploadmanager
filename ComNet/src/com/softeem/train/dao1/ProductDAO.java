package com.softeem.train.dao1;

import java.util.List;

import com.softeem.train.dto.ProductDTO;


public interface ProductDAO {

	boolean addProduct(ProductDTO pd);

	List<ProductDTO> allProducts(int i);

	int countpage();

	List<ProductDTO> allProducts1(int parseInt);

	ProductDTO findProductById(int productID);

	boolean updateProduct(ProductDTO pd);

	boolean deleteProduct(int parseInt);

}
