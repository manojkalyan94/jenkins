package com.payment.resource.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.payment.resource.payment.dao")
public class Mainapplication {


	public static void main(String args[]) {
		
		SpringApplication.run(Mainapplication.class, args);
	}
}
