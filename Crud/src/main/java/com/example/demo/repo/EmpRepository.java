package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entites.emp;

public interface EmpRepository extends CrudRepository<emp, Integer> {

}
