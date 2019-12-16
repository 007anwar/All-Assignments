package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Product;
import com.example.demo.repo.productRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinderMethodsApplicationTests {
	@Autowired
productRepo repo;
	@Test
	public void find() {
		List<Product> findByName = repo.findByName("laptop");
		findByName.forEach(p->System.out.println(p.getDesc()));
	}

}