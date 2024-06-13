package com.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsApplication.class, args);
		System.out.println("Welcome to Student Details");
	}
}
