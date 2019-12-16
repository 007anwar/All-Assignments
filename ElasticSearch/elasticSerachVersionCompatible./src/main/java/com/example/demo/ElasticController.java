package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ElasticController {
	 
	   
	@Autowired
	repo repo;
	@RequestMapping( value = "/books",method = RequestMethod.POST)
private String saveBook(Book book)
{
		repo.save(book);
		System.out.println("data saved");
	return null;
	
	
}
	
}
