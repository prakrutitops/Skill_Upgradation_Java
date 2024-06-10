package com.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringBootSecurity11Application {

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootSecurity11Application.class, args);
	}

}
