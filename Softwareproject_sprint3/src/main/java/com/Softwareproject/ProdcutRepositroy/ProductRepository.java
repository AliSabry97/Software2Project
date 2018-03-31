package com.Softwareproject.ProdcutRepositroy;

import org.springframework.data.repository.CrudRepository;

import com.Softwareproject.products.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	

}
