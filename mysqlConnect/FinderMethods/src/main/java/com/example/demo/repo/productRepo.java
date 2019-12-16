package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Product;

public interface productRepo extends CrudRepository<Product, Integer>{
List<Product> findByName(String prod);
}
