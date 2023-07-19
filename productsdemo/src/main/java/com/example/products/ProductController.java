package com.example.products;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.model.Products;
import com.example.products.model.TestProduct;
import com.example.products.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	 
	@Autowired
	ProductService service;
	
	@GetMapping("/test")
	public List<TestProduct> getAllProducts(){
		return service.getTestData();
	}
	
	@GetMapping("/id/{id}")
	
	public ResponseEntity<List<Products>> showAllProductsBasedOnId(@PathVariable("id")Integer id){
		List<Products> products = service.getProductsLessThanGivenId(id);
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<List<Products>> showAllProductsByName(@PathVariable("name")String name){
		List<Products> products = service.getProductsByName(name);
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Products>> getProductById(@PathVariable Integer id){
		return new ResponseEntity<>(service.getProductById(id), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Products>> showAllProducts(){
		List<Products> products = service.getAllProducts();
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Products> createProduct(@RequestBody Products product){
		return new ResponseEntity<>(service.saveProduct(product), HttpStatus.CREATED);
	}
	
	

}
