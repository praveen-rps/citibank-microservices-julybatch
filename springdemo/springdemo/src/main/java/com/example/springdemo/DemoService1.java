package com.example.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("c1")
@Primary
public class DemoService1 implements IDemoService{
	
	
	public String sales() {
		return "demo service1 sales is intitated";
	}

	public String shipment() {
		return "demo service 1shipment is intitiated";
	}
}
