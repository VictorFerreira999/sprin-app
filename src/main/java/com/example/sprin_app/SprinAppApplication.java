package com.example.sprin_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("dev")
public class SprinAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinAppApplication.class, args);
	}

}
