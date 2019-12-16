package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entitys.Address;
import com.example.demo.entitys.Employee;
import com.example.demo.repo.EmployeeRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentMappingApplicationTests {
@Autowired
	EmployeeRepo repo;
	@Test
	public void create() {
		Employee employee = new Employee();
		Address address = new Address();
		address.setCity("Wai");
		address.setCountry("India");
		address.setState("Maharashtra");
		address.setStreetaddress("plot no:10");
		address.setZipcode("412803");
		employee.setId(1);
		employee.setName("Anwar");
		employee.setAddress(address);
		repo.save(employee);
	}

}
