package com.example.demo.repository;

import java.util.Optional;

import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.SearchQuery;

import com.example.demo.model.Employee;

public class impl implements Employeerepository{
	 // @Value("${elasticsearch.index.name}")
	    private String indexName="company";

	   // @Value("${elasticsearch.user.type}")
	    private String userTypeName="employee";

		@Override
		public <S extends Employee> S index(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Iterable<Employee> search(QueryBuilder query) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Page<Employee> search(QueryBuilder query, Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Page<Employee> search(SearchQuery searchQuery) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Page<Employee> searchSimilar(Employee entity, String[] fields, Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void refresh() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Class<Employee> getEntityClass() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Iterable<Employee> findAll(Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Page<Employee> findAll(Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Employee> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Employee> Iterable<S> saveAll(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public Iterable<Employee> findAll() {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}

	
		@Override
		public void delete(Employee entity) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll(Iterable<? extends Employee> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}
	/*
	 * @Override public Employee addEmployee(Employee emp) { // TODO Auto-generated
	 * method stub return null; }
	 */
	
	  public Employee addEmployee(Employee emp) { IndexQuery userQuery = new
	  IndexQuery(); userQuery.setIndexName(indexName);
	  userQuery.setType(userTypeName); userQuery.setObject(emp);
	  
	  System.out.println("SAVED"); return emp; }

	@Override
	public Optional<Employee> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Employee> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}
	 

	

}