package com.scriptuit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRabbitMqPublisherApplication {

	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { SpringBootRabbitMqPublisherApplication.class }, args);
	}
}