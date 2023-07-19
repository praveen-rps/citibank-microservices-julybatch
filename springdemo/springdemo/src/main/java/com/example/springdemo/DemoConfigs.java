package com.example.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DemoConfigs {
	
		
	@Bean
	public Address address() {
		return new Address();
	}
	
	@Bean
	public Person person() {
		return new Person("1001","Praveen",address());
	}

}
