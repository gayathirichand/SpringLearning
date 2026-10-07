package com.productapp.service;

import java.util.List;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;

public interface IProductService {

	void addProduct(Product product);

	void updateProduct(Product product);

	void deleteProduct(int productId);

	Product getById(int productId) throws ProductNotFoundException;

	List<Product> getAllProducts();

	// derived queries
	List<Product> getByLesserPrice(double price) throws ProductNotFoundException;

	List<Product> getByBrand(String brand) throws ProductNotFoundException;

	List<Product> getByProductNameContains(String productname);

	// custom query - JPQL
	List<Product> getByBrandPrice(String brand, double cost);

	List<Product> getByCatBrand(String category, String brand);

	// native query - pass the table name, also the column names(cost)
	List<Product> getByCatPrice(String category, double price);

}
