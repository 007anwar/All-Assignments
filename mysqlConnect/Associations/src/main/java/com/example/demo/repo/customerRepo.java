package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entitys.customer;

public interface customerRepo extends CrudRepository<customer, Long> {

}
