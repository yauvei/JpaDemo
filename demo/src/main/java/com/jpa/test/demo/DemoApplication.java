package com.jpa.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan(basePackages = {"com.jpa.test.demo.repository","com.jpa.test.demo.resource"}) 
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
