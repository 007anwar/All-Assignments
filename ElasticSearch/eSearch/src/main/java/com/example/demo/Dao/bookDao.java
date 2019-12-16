package com.example.demo.Dao;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;
import com.fasterxml.jackson.databind.ObjectMapper;


@Repository
public class bookDao {
	  private final String INDEX = "lib";
	  private final String TYPE = "book";  
	  private RestHighLevelClient restHighLevelClient;
	  private ObjectMapper objectMapper;
	  
	  //CONSTRUCTOR
	  
	  public bookDao( ObjectMapper objectMapper, RestHighLevelClient restHighLevelClient) {
		    this.objectMapper = objectMapper;
		    this.restHighLevelClient = restHighLevelClient;
		  }
	  
	 //INSERT
	  @SuppressWarnings("deprecation")
	public Book insert(Book bk)
	  {
		bk.setId(UUID.randomUUID().toString());
Map convertValue = objectMapper.convertValue(bk, Map.class);
IndexRequest indexRequest = new IndexRequest(INDEX, TYPE,bk.getId()).source(convertValue);


try {
	IndexResponse response = restHighLevelClient.index(indexRequest);
} catch (ElasticsearchException e) {
	e.printStackTrace();
}catch (IOException e) {
e.printStackTrace();
}
		return bk;
		  
	  }
}
