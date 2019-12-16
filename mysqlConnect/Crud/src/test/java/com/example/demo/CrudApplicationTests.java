package com.example.demo;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.stud;
import com.example.demo.repo.studRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrudApplicationTests {
	@Autowired
	studRepo repo;

	@Test
	public void create() {
		stud stud = new stud();
		stud.setId(3);
		stud.setName("ghi");
		repo.save(stud);
	}

	@Test
	public void read() {
		Iterable<stud> findAll = repo.findAll();
		for (stud stud : findAll) {
			System.out.println(stud);
		}
	}

	@Test
	public void update() {
		Optional<stud> findById = repo.findById(1);
		stud stud = findById.get();
		stud.setName("New");
		repo.save(stud);

	}

	@Test
	public void delete() {

		repo.deleteById(1);

	}
	@Test
	public void delete1() {
stud stud = new stud();
stud.setId(1);
if(repo.existsById(1))
		repo.delete(stud);

	}
	@Test
	public void countt()
	{
		System.out.println(repo.count());
	}

}