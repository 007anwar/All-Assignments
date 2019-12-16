package com.example.demo.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
 @Configuration
@Repository
public interface Employeerepository extends ElasticsearchRepository<Employee, Integer>   {
	 Employee addEmployee(Employee emp);
}
