package com.main.enniyal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class EnniyalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnniyalApplication.class, args);
		System.out.println("Test code");
	}

}
