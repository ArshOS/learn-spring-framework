package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) { }
record Address (String street, String city) { }

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name () {
		return "Ranga";
	}
	
	@Bean
	public int age () {
		return 15;
	}
	
	@Bean
	public Person person () {
		return new Person ("Ravi", 20);
	}
	
	@Bean
	public Address address () {
		return new Address ("Baker Street", "London");
	}
	
	@Bean
	public Address address2 () {
		return address();
	}
	
	@Bean
	public Person person2 () {
		return new Person (name(), age());
	}
	
	@Bean
	public Person person3 (String name, int age) {
		return new Person (name, age);
	}
	
	
}
