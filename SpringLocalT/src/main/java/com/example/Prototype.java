package com.example;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Prototype {
	@Bean
	@Scope("prototype")
	public String greeting() {
		return "Hello my friends";
	}
	@Bean
	@Scope("prototype")
	public LocalTime show() {
		return LocalTime.now();
		
	}
	@Bean
	@Scope("prototype")
	public Person showPerson() {
		return new Person("Gambit", 23);
		
	}
	@Bean
	@Scope("prototype")
	public Product showProduct() {
		return new Product();
	
	
	
		
	}

}
