package com.example.demo;

import java.util.HashSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.customer;
import com.example.demo.entities.phone_number;
import com.example.demo.repos.customerRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
@Autowired
	customerRepo repo;
	@Test
	public void create() {
		customer customer = new customer();
		//customer.setId(007);
		customer.setName("Name");
		phone_number phone_number = new phone_number();
		HashSet<phone_number> hashSet = new HashSet<>();
		phone_number.setId(1);
		phone_number.setNumber("9763025121");
		phone_number.setType("Personal");
		hashSet.add(phone_number);
		customer.setNumbers(hashSet);
		repo.save(customer);
	}

}
