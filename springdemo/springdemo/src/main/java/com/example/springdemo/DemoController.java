package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class DemoController {
	
	
	@Autowired
	//@Qualifier("c1")
	IDemoService service;
	
	@GetMapping("/sales")
	public String sales() {
		return service.sales();
	}
	
	@GetMapping("/shipment")
	public String shipment() {
		return service.shipment();
	}
	
	
	@PostMapping("/post")
	public String postTest() {
		return "Post method is called";
	}

	@PutMapping("/put")
	public String puttTest() {
		return "Put method is called";
	}
	
	@DeleteMapping("/delete")
	public String deleteTest() {
		return "delete method is called";
	}
	
	@GetMapping("/get1")
	public String getTest1() {
		return "Get Method's - test1 is called";
	}
	
	@GetMapping("/get2")
	public String getTest2() {
		return "Get Method's - test2 is called";
	}
	
	
}
