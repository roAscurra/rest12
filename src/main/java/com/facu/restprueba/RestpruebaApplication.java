package com.facu.restprueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestpruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestpruebaApplication.class, args);

		System.out.println("Estoy auditando nuevo");
	}

}
