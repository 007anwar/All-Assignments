package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Employee;
import com.example.demo.repo.employeeRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneratorsDemoApplicationTests {
@Autowired
	employeeRepo repo;
	@Test
	public void testCreate() {
		Employee employee = new Employee();
	//	employee.setId(007l);
		employee.setName("AZAM");
		repo.save(employee);
	}
	

}
