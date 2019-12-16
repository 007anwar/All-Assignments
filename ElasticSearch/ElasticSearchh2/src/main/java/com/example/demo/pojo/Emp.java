package com.example.demo.pojo;

import org.springframework.data.annotation.Id;

public class Emp {
private String name;
@Id
private int id;
@Override
public String toString() {
	return "Emp [name=" + name + ", id=" + id + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
