package com.example.springdemo;

import org.springframework.stereotype.Component;

@Component("c2")
public class DemoService2 implements IDemoService{

	public String sales() {
		return "demo service2 sales is intitated";
	}

	public String shipment() {
		return "demo service2 shipment is intitiated";
	}

}
