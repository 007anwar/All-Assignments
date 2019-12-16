package com.example.demo.repository;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
@RequestMapping(value= "/employee")
public class Mycontroller {
	   @PostMapping(value= "/save")
	   public void save(@RequestBody Employee myemployees) {
impl impl = new impl();
	   impl.addEmployee(myemployees);
	   }
}
