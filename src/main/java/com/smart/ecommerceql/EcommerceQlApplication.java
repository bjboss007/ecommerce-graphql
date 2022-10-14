package com.smart.ecommerceql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class EcommerceQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceQlApplication.class, args);
	}

}
