package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.employee;
import com.example.demo.repo.employerepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneratorsApplicationTests {
	@Autowired
	employerepo repo;

	@Test
	public void save() {
		employee employee = new employee();
		// employee.setId(1);
		employee.setName("abc");
		repo.save(employee);
	}

}
