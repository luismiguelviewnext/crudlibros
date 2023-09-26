package com.curso.inicio.crudlibros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = { "com.curso.controller", "com.curso.service"} )
public class CrudlibrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudlibrosApplication.class, args);
	}

}
