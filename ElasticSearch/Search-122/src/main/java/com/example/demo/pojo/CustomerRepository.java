package com.example.demo.pojo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.demo.repo.Customer;

public interface CustomerRepository extends ElasticsearchRepository<Customer, Long> {

}
