package com.example;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLocalTApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLocalTApplication.class, args);
		//Object byName = context.getBean("Show")
		
		Object byName = context.getBean("Show");
		LocalTime byType = context.getBean(LocalTime.class);
		LocalTime byBoth = context.getBean("Show", LocalTime.class);
		System.out.println(byName);
		System.out.println(byType);
		System.out.println(byBoth);
		
	}
	
	public LocalTime show()
	{
		return LocalTime.now();
	}
	

}
