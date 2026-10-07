package com.productapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

	private final IProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		Product savedProduct = productRepository.save(product);
		System.out.println(savedProduct);
	}

	@Override
	public void updateProduct(Product product) {
		// call the method of the CRUD repo
		// pass product without id -> create an id and create a new product in the table
		// .
		// suppose if the product come with id - check if id is exists
		// if yes product will update else it will create new product in the table
		Product updatedProduct = productRepository.save(product);
		System.out.println(updatedProduct);
	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public Product getById(int productId) throws ProductNotFoundException {

		/*
		 * Optional<Product> productOpt=productRepository.findById(productId);
		 * if(productOpt.isPresent()) { return productOpt.get();
		 * 
		 * } else { throw new ProductNotFoundException(""); }
		 */
		return productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException(null));
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = productRepository.findAll();
		return products;
	}

	@Override
	public List<Product> getByLesserPrice(double price) throws ProductNotFoundException {
		List<Product> products = productRepository.findByPriceLessThan(price);

		return products;
	}

	@Override
	public List<Product> getByBrand(String brand) throws ProductNotFoundException {
		List<Product> products = productRepository.findByBrand(brand);
		return products;
	}

	@Override
	public List<Product> getByProductNameContains(String productname) {
		List<Product> products = productRepository.findByProductNameContains(productname);
		return products;
	}

	@Override
	public List<Product> getByBrandPrice(String brand, double cost) {
		List<Product> products = productRepository.findByBrandPrice(brand, cost);
		return products;
	}

	@Override
	public List<Product> getByCatBrand(String category, String brand) {
		List<Product> products = productRepository.findByCatBrand(category, brand);

		return products;
	}

	@Override
	public List<Product> getByCatPrice(String category, double price) {
		List<Product> products = productRepository.findByCatPrice(category, price);
		return products;
	}

}
