package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableWebSecurity
@RestController
public class BasicAuthPract1Application {

	public static void main(String[] args) {
		SpringApplication.run(BasicAuthPract1Application.class, args);
	}
@RequestMapping("/hello")
public String hello()
{
	return"hello";
}
}
