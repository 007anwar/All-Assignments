package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;

public interface employeeRepo extends CrudRepository<Employee, Long> {

}
