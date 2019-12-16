package com.example.demo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface repo extends ElasticsearchRepository<Book, String> {

}
