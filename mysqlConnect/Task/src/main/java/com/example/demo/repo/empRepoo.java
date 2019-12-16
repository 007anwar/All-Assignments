package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Emp;

public interface empRepoo extends CrudRepository<Emp, Long> {

}
