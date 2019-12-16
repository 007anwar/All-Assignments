package com.example.demo.dao;

import com.example.demo.model.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class BookDao {

  private final String INDEX = "bookdata";
  private final String TYPE = "books";  
  private RestHighLevelClient restHighLevelClient;
  private ObjectMapper objectMapper;

  public BookDao( ObjectMapper objectMapper, RestHighLevelClient restHighLevelClient) {
    this.objectMapper = objectMapper;
    this.restHighLevelClient = restHighLevelClient;
  }
  public Book insertBook(Book book){
	  book.setId(UUID.randomUUID().toString());
	  Map dataMap = objectMapper.convertValue(book, Map.class);
	  IndexRequest indexRequest = new IndexRequest(INDEX, TYPE, book.getId())
	                .source(dataMap);
	  //System.out.println(indexRequest);
	  try {
	    IndexResponse response = restHighLevelClient.index(indexRequest, null);
	    } catch(ElasticsearchException e) {
	    e.getDetailedMessage();
	  } catch (java.io.IOException ex){
	    ex.getLocalizedMessage();
	  }
	  return book;
	}

}