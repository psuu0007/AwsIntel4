package com.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHomeApplication.class, args);
		
		System.out.println("일단 되나?");
	}

}
