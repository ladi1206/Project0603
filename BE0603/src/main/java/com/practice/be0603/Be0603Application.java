package com.practice.be0603;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.practice.be0603.Entity")
@ComponentScan("com.practice.be0603")
public class Be0603Application {

	public static void main(String[] args) {
		SpringApplication.run(Be0603Application.class, args);
	}

}
