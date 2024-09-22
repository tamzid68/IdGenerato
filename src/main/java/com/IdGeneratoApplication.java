package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IdGeneratoApplication {

	public static void main(String[] args) {

		SpringApplication.run(IdGeneratoApplication.class, args);
		System.out.println("Okay!");
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			System.out.println("JDBC Driver loaded successfully");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
