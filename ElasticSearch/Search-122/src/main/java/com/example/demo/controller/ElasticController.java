package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.CustomerRepository;
import com.example.demo.repo.Customer;

@RestController
public class ElasticController {
@Autowired
	CustomerRepository rp;
@RequestMapping(value = "/logincheck",method = RequestMethod.POST)
void abc(@RequestParam("id") String id,@RequestParam("name")String password ,Customer cust,ModelMap mod)
{
	rp.save(cust);
}
}
