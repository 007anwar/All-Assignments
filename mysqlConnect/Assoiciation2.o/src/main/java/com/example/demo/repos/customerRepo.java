package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.customer;

public interface customerRepo extends CrudRepository<customer, Long> {

}
