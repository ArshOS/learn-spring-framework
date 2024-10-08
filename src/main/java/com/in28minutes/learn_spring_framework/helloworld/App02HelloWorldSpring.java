package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		try (//1: Launch Spring context.
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			//3: Retrieve 
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3"));
		}
		
		//2: Configure the things that we want Spring to manage - @Configuration


	}

}
