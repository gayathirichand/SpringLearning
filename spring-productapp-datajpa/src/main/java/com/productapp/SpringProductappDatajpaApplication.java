package com.productapp;

import com.productapp.service.ProductServiceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappDatajpaApplication implements CommandLineRunner {

	private final ProductServiceImpl productServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappDatajpaApplication.class, args);
	}

	private IProductService productService;

	SpringProductappDatajpaApplication(ProductServiceImpl productServiceImpl) {
		this.productServiceImpl = productServiceImpl;
	}

	@Autowired
	public void setProductService(IProductService productService) {
		this.productService = productService;
	}

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product("Mobile", null, 85000, "IPhone", "Electronics", 4);
		productService.addProduct(product);
		product = new Product("Mobile", null, 45000, "Samsung", "Electronics", 3);
		productService.addProduct(product);
		product = new Product("Laptop", null, 82000, "MacBook", "Electronics", 4);
		productService.addProduct(product);
		product = new Product("AC", null, 32000, "Blue Star", "Home Appliances", 3);
		productService.addProduct(product);
		product = new Product("Fridge", null, 13000, "LG", "Home Appliances", 3);
		productService.addProduct(product);
		product = new Product("Washing Machine", null, 14000, "Whirl Pool", "Home Appliances", 4);
		productService.addProduct(product);
		product = new Product("Hard Disk", null, 5000, "Samsung", "Spare Parts", 3);
		productService.addProduct(product);
		product = new Product("Remote", null, 2000, "LG", "Spare Parts", 4);
		productService.addProduct(product);
		product = new Product("Battery", null, 8000, "Exide", "Spare Parts", 3);
		productService.addProduct(product);
		product = new Product("Laptop", null, 63000, "HP", "Electronics", 4);
		productService.addProduct(product);

		System.out.println("Get BY ID");
		Product nProduct = productService.getById(2);
		System.out.println(nProduct);
		System.out.println();
		System.out.println("Update method calling");
		nProduct.setBrand("OPPO");
		productService.updateProduct(nProduct);
		System.out.println();

		System.out.println("Delete method calling");
		productService.deleteProduct(10);
		System.out.println();

		System.out.println("Get All method calling");
		productService.getAllProducts().forEach(System.out::println);
		System.out.println();

		System.out.println("GetByLesserPrice method calling");
		productService.getByLesserPrice(10000).forEach(System.out::println);
		System.out.println();
		
		System.out.println("GetBy brand method calling");
		productService.getByBrand("LG").forEach(System.out::println);
		System.out.println();
	    
		System.out.println("Get By Product Name Contains method calling");
		productService.getByProductNameContains("Mobile").forEach(System.out::println);
		System.out.println();
		
		System.out.println("Get By Brand Price method calling");
		productService.getByBrandPrice("LG",10000).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Get By Category and Brand  method calling");
		productService.getByCatBrand("Electronics","MacBook").forEach(System.out::println);
		System.out.println();
		
		System.out.println("Get by category and price method calling");
		productService.getByCatPrice("Electronics",50000).forEach(System.out::println);
}

}
