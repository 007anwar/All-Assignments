package com.example.demo;


import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableResourceServer
@SpringBootApplication
public class MyAuthenticationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAuthenticationServerApplication.class, args);
	}
	
	public Principal user(Principal user)
	{
		return user;
	}

	public static class AuthenticationManagerConfiguration extends GlobalAuthenticationConfigurerAdapter
	{

		@Override
		public void init(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication().withUser("javainuse-user").password("javainuse-pass").roles("USER");
		}
		
	}
	
	public static class conf extends WebSecurityConfigurerAdapter{
		@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
		@Override
		public AuthenticationManager authenticationManagerBean() throws Exception {
			 return super.authenticationManagerBean();
		}
	}
}
