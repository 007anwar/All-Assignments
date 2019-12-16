package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Dept;

public interface deptRepo extends JpaRepository<Dept, Integer> {

}
