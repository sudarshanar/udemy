package com.myapp.SpringBootIn28;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ap =SpringApplication.run(DemoApplication.class, args);
		for(String name : ap.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
