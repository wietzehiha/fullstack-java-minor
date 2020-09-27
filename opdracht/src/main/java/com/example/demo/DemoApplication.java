package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@EnableCaching
@ActiveProfiles({"dev"})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.default", "prod");
		SpringApplication.run(DemoApplication.class, args);
	}

}
