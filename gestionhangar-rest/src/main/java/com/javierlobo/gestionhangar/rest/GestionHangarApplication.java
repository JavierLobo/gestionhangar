package com.javierlobo.gestionhangar.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@ComponentScan({"com.javierlobo.gestionhangar"})
@EntityScan("com.javierlobo.gestionhangar")
@EnableJpaRepositories("com.javierlobo.gestionhangar")
public class GestionHangarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionHangarApplication.class, args);
	}

}