package com.example.demo.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String name;
@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
private Set<phone_number> numbers;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<phone_number> getNumbers() {
	return numbers;
}
public void setNumbers(Set<phone_number> numbers) {
	this.numbers = numbers;
}

}
