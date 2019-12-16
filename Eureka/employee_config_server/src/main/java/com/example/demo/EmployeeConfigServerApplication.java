package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.retry.annotation.Retryable;

@SpringBootApplication
@EnableConfigServer
public class EmployeeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeConfigServerApplication.class, args);
	}

}