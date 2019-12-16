package com.example.demo;

import java.util.HashSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entitys.customer;
import com.example.demo.entitys.phone_number;
import com.example.demo.repo.customerRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssociationsApplicationTests {
    @Autowired 
	customerRepo repo;
	@Test
	public void createCust() {
customer customer = new customer();
customer.setName("Anwar");
HashSet<phone_number> number = new HashSet<phone_number>();
phone_number e=new phone_number();
e.setNumber("123");
e.setType("ofc");
e.setCustomer(customer);
//e.setId(1);
number.add(e);
//phone_number e2=new phone_number();
//e.setNumber("1323456");
//e.setType("ofc");
number.add(e);
customer.setNumber(number);
repo.save(customer);
	}

}