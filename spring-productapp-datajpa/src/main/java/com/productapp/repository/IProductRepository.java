package com.productapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.productapp.model.Product;
import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Integer> {

	// derived quries
	// findBy,getBy,queryBy

	List<Product> findByBrand(String brand);

	List<Product> findByPriceLessThan(double price);

	List<Product> findByProductNameContains(String productName);

	// custom query-JPQL
	// any method name - use @Query pass only the e4crfntity name, only instance
	// variable name
	@Query("select p from Product p where p.brand=?1 and  p.price<?2")
	List<Product> findByBrandPrice(String brand, double cost);
	
	

	@Query("select p from Product p where p.category=?1 and p.brand=?2")
	List<Product> findByCatBrand(String category, String brand);

	// native Query- pass the table name and column name not instance variable name

	@Query(value = """
			select * from product p where p.category=?1 and p.cost<?2
			""", nativeQuery = true)
	List<Product> findByCatPrice(String category, double price);

}
