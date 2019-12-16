package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowEmployee {
	@RequestMapping("/emp")
public Employee showEmp()
{
	Employee employee = new Employee();
	employee.setName("Anwar");
	employee.setCompany("Nihilent");
	return employee;
}
}
