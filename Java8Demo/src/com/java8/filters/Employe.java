package com.java8.filters;

public class Employe {
private int id;
private String name;
private String role;

public Employe( String name, String role,int id) {
	super();
	this.id = id;
	this.name = name;
	this.role = role;
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

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", role=" + role + "]";
}
}
