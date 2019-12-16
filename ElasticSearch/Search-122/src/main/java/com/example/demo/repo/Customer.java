package com.example.demo.repo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(
	    indexName = "customers", 
	    type = "customer", 
	    shards = 1, 
	    replicas = 0, 
	    refreshInterval = "-1"
	)
	public class Customer {
	    @Id
	    private Long id;
	    private String name;
	    public Customer() {
		}
	    
		public Customer(Long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

	}