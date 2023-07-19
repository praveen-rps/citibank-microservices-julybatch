package com.example.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.products.dao.ProductRepository;
import com.example.products.model.Products;
import com.example.products.model.TestProduct;



@Service
public class ProductServiceImpl implements ProductService {
	
	
	@Autowired
	ProductRepository repo;

	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Products saveProduct(Products product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public Optional<Products> getProductById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<Products> getProductsByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}

	@Override
	public List<Products> getProductsLessThanGivenId(int id) {
		// TODO Auto-generated method stub
		return repo.findProductsLessThanGivenId(id);
				
	}

	@Override
	public List<TestProduct> getTestData() {
		// TODO Auto-generated method stub
		return repo.getAllTestProducts();
	}

	

}
