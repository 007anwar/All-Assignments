package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eid;
	private String name;
	@ManyToOne
	@JoinColumn(name = "did", referencedColumnName = "did")
	private department dept;

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public department getDept() {
		return dept;
	}

	public void setDept(department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "employee [eid=" + eid + ", name=" + name + ", dept=" + dept + "]";
	}

}
