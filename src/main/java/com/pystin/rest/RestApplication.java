package com.pystin.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {

//	public static void main(String[] args) {
//		DBConnection bk = new DBConnection();
//		bk.connect();
//	}

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
