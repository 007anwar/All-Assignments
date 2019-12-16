package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Emp {
	@Id
private long eid;
private long did;
private String name;
@ManyToOne
@JoinColumn(name = "did")
private Dept dept;
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
public long getDid() {
	return did;
}
public void setDid(long did) {
	this.did = did;
}
public Dept getDept() {
	return dept;
}
public void setDept(Dept dept) {
	this.dept = dept;
}
}
