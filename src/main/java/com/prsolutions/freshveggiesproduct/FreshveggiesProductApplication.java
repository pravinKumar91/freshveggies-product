package com.prsolutions.freshveggiesproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FreshveggiesProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreshveggiesProductApplication.class, args);
	}

}
