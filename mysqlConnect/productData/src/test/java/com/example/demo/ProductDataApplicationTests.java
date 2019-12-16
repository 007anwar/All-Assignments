package com.example.demo;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepository;

import antlr.collections.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDataApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	ProductRepository repo;
	@Test
public void testCreate()
{
Product product = new Product();
product.setId(10);
product.setName("fds");
product.setDesc("xyz");
product.setPrice(82954d);
repo.save(product);
System.out.println("Product saved");
}   @Test
	public void readTest()
	{
	Optional<Product> findById = repo.findById(1);
	Product product = findById.get();
	product.setPrice(1200d);
	repo.save(product);
	System.out.println("Product updated");
		
	}
@Test
public void deleteTest()
{
	repo.deleteById(1);
	System.out.println("Entity Deleted");
}
@Test
public void byname()
{
	Product findByName = repo.findByName("iphoen");
	Double price = findByName.getPrice();
	String name = findByName.getName();
	System.out.println(name+"="+price);
}
@Test
public void findbyNandD()
{
	Product findByNameAndDesc = repo.findByNameAndDesc("iphoen", "goo");
	Double price = findByNameAndDesc.getPrice();
	System.out.println(price);
}
@Test
public void fbydescont()
{
	java.util.List<Product> findByPriceDescContains = repo.findByDescContains("good");
	findByPriceDescContains.forEach(p->System.out.println(p.getName()));
}
@Test
public void priceGT()
{
 java.util.List<Product> findByprPriceGreaterThan = repo.findByPriceGreaterThan(10d);
	findByprPriceGreaterThan.forEach(p->System.out.println(p.getName()));
	
	
}
@Test
public void fbp()
{
 java.util.List<Product> list = repo.findByPriceBetween(10d, 1000d);
 list.forEach(a->System.out.println(a.getName()));
	
	
	
}
@Test
public void findallpag()
{
	Pageable page=new PageRequest(0, 2);
Page<Product> findAll = repo.findAll(page)	;
findAll.forEach(a->System.out.println(a.getName()));
	
	
	
}
@SuppressWarnings("deprecation")
@Test
public void findallsorting()
{
	
	repo.findAll(new Sort("name")).forEach(p->System.out.println(p.getName()));
	
}


}