package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.employee;

public interface employerepo extends CrudRepository<employee, Long> {

}
