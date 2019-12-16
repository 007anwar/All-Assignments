package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.pojo.Emp;
import com.example.demo.pojo.studentRepo;

@SpringBootApplication
public class ElasticSearchh2Application {
	@Autowired
	public static studentRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchh2Application.class, args);
		Emp emp = new Emp();
		emp.setId(1);
		emp.setName("ANWAR");
		repo.save(emp);
	}

}
