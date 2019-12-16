package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.cash;
import com.example.demo.entity.check;
import com.example.demo.entity.creditCard;
import com.example.demo.repo.paymentRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateInheritanceApplicationTests {
	@Autowired
	paymentRepo repo;

	@Test
	public void createPay() {
		creditCard creditCard = new creditCard();
		creditCard.setId(1234);
		creditCard.setAmount(1000d);
		creditCard.setCardnumber("1278");
		repo.save(creditCard);

	}

	@Test
	public void createCheckPay() {
		check check = new check();
		check.setId(1232);
		check.setAmount(1000d);
		check.setChecknumber("121321");
		repo.save(check);

	}

	@Test
	public void cashPay() {
		cash cash = new cash();
		cash.setId(1);
		cash.setAmount(1239d);
		cash.setNoteno("asdhkja12");
		repo.save(cash);
	}

}
