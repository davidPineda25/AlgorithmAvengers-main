package com.algoritms.avengers.senasoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.algoritms.avengers.senasoft")
@SpringBootApplication
public class SenasoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenasoftApplication.class, args);
	}

}
