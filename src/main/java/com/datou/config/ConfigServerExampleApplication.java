package com.datou.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigServerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerExampleApplication.class, args);
	}

}
