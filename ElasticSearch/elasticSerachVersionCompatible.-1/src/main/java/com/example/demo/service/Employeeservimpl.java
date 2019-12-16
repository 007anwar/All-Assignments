package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.Employeerepository;
 
 
@Service
public class Employeeservimpl  {
 
    // The dao repository will use the Elastic-Search-Repository to perform the database operations.
    @Autowired
    private Employeerepository edao;
 
    /* (non-Javadoc)
     * @see com.springboot.elasticsearch.service.Employeeserv#saveEmployee(java.util.List)
     */
    public void saveEmployee(List<Employee> employees) {
        edao.saveAll(employees);
    }
 
    /* (non-Javadoc)
     * @see com.springboot.elasticsearch.service.Employeeserv#findAllEmployees()
     */
    public Iterable<Employee> findAllEmployees() {
        return edao.findAll();
    }
 
    /* (non-Javadoc)
     * @see com.springboot.elasticsearch.service.Employeeserv#findByDesignation(java.lang.String)
     */
    public List<Employee> findByDesignation(String designation) {
        return edao.findByDesignation(designation);
    }
    
    
    public void save(Employee emp)
    {
    	edao.save(emp);
    }
    }
