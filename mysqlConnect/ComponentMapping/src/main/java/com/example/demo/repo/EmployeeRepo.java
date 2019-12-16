package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entitys.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
