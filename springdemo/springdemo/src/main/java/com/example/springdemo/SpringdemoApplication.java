package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringdemoApplication.class, args);
		
		Address a1 = context.getBean(Address.class);
		System.out.println(a1.hashCode());
		
		Address a2 = context.getBean(Address.class);
		System.out.println(a2.hashCode());
			
			
		Person p = context.getBean(Person.class);
		System.out.println(p);
		
	
	}

}
