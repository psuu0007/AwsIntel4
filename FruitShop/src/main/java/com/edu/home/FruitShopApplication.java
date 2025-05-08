package com.edu.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FruitShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruitShopApplication.class, args);
		System.out.println("아 되는구나");
	}

}
