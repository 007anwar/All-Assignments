package com.example.demo;

public class Employee {
private String name;
private String company;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", company=" + company + "]";
}

}
