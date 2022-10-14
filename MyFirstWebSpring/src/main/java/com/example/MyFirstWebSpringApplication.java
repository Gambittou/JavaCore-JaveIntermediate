package com.example;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstWebSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyFirstWebSpringApplication.class, args);
		
		Object byName = context.getBean("Greeting");
		String byType = context.getBean(String.class);
		String byBoth = context.getBean("Greeting", String.class);
		
		System.out.println(byName);
		System.out.println(byType);
		System.out.println(byBoth);
	}
	public String greeting() {
		return "Hello, World";
		
	}public LocalTime greeting1() {
		return LocalTime.now();
		
	}

}
