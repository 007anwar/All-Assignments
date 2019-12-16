package com.example.demo.entity;

import javax.persistence.Entity;

@Entity
public class cash extends payment{
	private String noteno;

	public String getNoteno() {
		return noteno;
	}

	public void setNoteno(String noteno) {
		this.noteno = noteno;
	}

}
