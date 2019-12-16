package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@SpringBootApplication
public class MycodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycodeApplication.class, args);
	}
public void authenticationManager(AuthenticationManagerBuilder auth)
{
    try {
		auth
		.inMemoryAuthentication()   
		    .withUser("user1").password("password1").roles("USER").and()
		    .withUser("user2").password("password2").roles("USER").and()
		    .withUser("user3").password("password3").roles("USER");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
