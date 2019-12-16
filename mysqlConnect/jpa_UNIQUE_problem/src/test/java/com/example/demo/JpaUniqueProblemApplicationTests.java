package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.department;
import com.example.demo.entity.employee;
import com.example.demo.repo.deptRepo;
import com.example.demo.repo.employeeRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaUniqueProblemApplicationTests {
@Autowired
	employeeRepo repo;
@Autowired
deptRepo repo1;
	@Test
	public void create() {
		
		employee employee = new employee();
		department department = new department();
		//department.setDid(10);
		department.setName("CSE");
		repo1.save(department);
		employee.setEid(2);
		employee.setName("Anwar");
	employee.setDept(department);
	repo.save(employee);
	}

}
