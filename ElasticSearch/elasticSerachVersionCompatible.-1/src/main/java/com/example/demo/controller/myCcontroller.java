package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.Employeeservimpl;

@RestController
@RequestMapping(value= "/employee")
public class myCcontroller {
	@Autowired
Employeeservimpl employeeservimpl;
    @PostMapping(value= "/saveemployees")
    public String saveEmployee(@RequestBody Employee myemployees) {
        employeeservimpl.save(myemployees);
        return "Records saved in the db.";
    }
}
