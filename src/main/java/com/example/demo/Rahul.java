package com.example.demo;

public class Rahul {
	
	
private 	int id ;
	private String name ;
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
	@Override
	public String toString() {
		return "Rahul [id=" + id + ", name=" + name + "]";
	}
	public Rahul(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	} 
	
	

}
