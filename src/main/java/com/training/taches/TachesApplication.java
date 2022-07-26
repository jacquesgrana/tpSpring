package com.training.taches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TachesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TachesApplication.class, args);
	}

}
