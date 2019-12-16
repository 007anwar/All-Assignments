package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

 Product findByName(String name);
Product findByPrice(Double price);
Product findByNameAndDesc(String name,String desc);
List<Product> findByPriceGreaterThan(Double name);
List<Product> findByDescContains(String name);
List<Product>  findByPriceBetween(Double price1,Double price2);


}
