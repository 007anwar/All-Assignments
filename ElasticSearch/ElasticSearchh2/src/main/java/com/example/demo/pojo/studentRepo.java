package com.example.demo.pojo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface studentRepo extends ElasticsearchRepository<Emp, Integer>  {

}
