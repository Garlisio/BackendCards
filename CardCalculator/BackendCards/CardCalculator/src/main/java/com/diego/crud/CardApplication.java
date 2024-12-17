package com.diego.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class CardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardApplication.class, args);
	}

}
