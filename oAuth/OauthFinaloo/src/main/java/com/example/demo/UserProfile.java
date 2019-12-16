package com.example.demo;

public class UserProfile
{
    private String name;
    private String email;
 
    //Setters and getters
 
    @Override
    public String toString() {
        return "UserProfile [name=" + getName() + ", email=" + getEmail() + "]";
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

