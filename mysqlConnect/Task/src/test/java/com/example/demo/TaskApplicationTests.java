package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Entity.Dept;
import com.example.demo.Entity.Emp;
import com.example.demo.repo.deptRepo;
import com.example.demo.repo.empRepoo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskApplicationTests {
@Autowired
empRepoo repo;
@Autowired
deptRepo repo1;
	@Test
	public void saveEmp() {
Emp emp = new Emp();

Dept dept=new Dept();
dept.setDid(101);
dept.setName("CSE");
emp.setDept(dept);
emp.setDid(101);
emp.setName("Anwar");
emp.setEid(1);
repo.save(emp);
	}

}
