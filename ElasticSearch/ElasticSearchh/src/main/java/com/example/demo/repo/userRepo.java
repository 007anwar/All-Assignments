package com.example.demo.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.demo.pojo.User;

public interface userRepo extends ElasticsearchRepository<User, String>{

}
