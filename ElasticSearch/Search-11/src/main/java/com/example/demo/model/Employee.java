package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.stereotype.Component;
 
@Component
 
// Elastic search annotation.
@Document(indexName= "company", type= "employee")
public class Employee {
 @Id
    private int age;
    private int experienceInYears;
    private String name;
	public int getAge() {
		return age;
	}

	/*
	 * public Employee(int age, int experienceInYears, String name) { super();
	 * this.age = age; this.experienceInYears = experienceInYears; this.name = name;
	 * }
	 */
	@Override
	public String toString() {
		return "Employee [age=" + age + ", experienceInYears=" + experienceInYears + ", name=" + name + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExperienceInYears() {
		return experienceInYears;
	}
	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
  
}