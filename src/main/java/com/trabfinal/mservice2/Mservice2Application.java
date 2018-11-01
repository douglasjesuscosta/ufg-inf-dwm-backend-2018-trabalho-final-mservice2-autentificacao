package com.trabfinal.mservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaAuditing
public class Mservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mservice2Application.class, args);
	}
}
