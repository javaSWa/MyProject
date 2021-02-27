package com.swa;

public class Student {

	int id;
	String name;
	Address address;

	public Student(int id, String name, Address address) {

		System.out.println("Student object is created");
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		
		System.out.println("Student id: "+id+" Student Name: "+name+" Student Address: "+address.city);
	}

}
