package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Employee {
	@TableGenerator(name="employee_gen",table ="id_gen",pkColumnName = "gen_name",pkColumnValue = "gen_val",allocationSize = 100)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,generator = "employee_gen")
	private long id;
	private String name;

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
}
