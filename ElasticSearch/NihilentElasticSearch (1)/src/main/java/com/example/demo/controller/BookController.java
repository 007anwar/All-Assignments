package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

import com.example.demo.dao.BookDao;
import com.example.demo.model.Book;

import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    private com.example.demo.dao.BookDao bookDao;

    public BookController(BookDao bookDao) {
        this.bookDao = bookDao;
    }
@PostMapping
public Book insertBook(@RequestBody Book book) throws Exception {
  return bookDao.insertBook(book);
}

}

