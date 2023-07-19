package com.example.products.service;

import java.util.List;
import java.util.Optional;

import com.example.products.model.Products;
import com.example.products.model.TestProduct;


public interface ProductService {
	
	public List<Products> getAllProducts();
	public Products saveProduct(Products product);
	public Optional<Products> getProductById(int id);
	public List<Products> getProductsByName(String name);
	public List<Products> getProductsLessThanGivenId(int id);
	
	public List<TestProduct> getTestData();
	

}
