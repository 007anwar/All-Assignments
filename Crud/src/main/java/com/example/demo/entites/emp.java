package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class emp {
	@Id
private int id;
private String name;
private String email;
private String password;
@Override
public String toString() {
	return "emp [id=" + id + ", name=" + name + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
