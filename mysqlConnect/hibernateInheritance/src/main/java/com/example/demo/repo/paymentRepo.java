package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.payment;

public interface paymentRepo extends CrudRepository<payment, Integer> {

}
