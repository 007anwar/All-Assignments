package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.bookDao;
import com.example.demo.model.Book;

@RestController
@RequestMapping("/elastic")
public class ElasticController {
	 private bookDao bookDao;
	@RequestMapping(value = "/insert",method =RequestMethod.POST)
	public Book insertBook(@RequestBody Book book) throws Exception {
	  return bookDao.insert(book);
	}
}
