package com.example.model;

public class Sagar {
	
	private int id;
	
	private String name;
	
	private String Address;
	
	private String phoneNo;

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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Sagar [id=" + id + ", name=" + name + ", Address=" + Address + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	

}
