package com.example.demo.Entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dept {
	@Id
private long did;
private String name;
@OneToMany(mappedBy = "emp")
private Set<Emp> emp;
public long getDid() {
	return did;
}
public void setDid(long did) {
	this.did = did;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Emp> getEmp() {
	return emp;
}
public void setEmp(Set<Emp> emp) {
	this.emp = emp;
}

}
