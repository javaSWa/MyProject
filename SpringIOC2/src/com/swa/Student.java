package com.swa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



public class Student {
   
	
	@Value("${Student.name}")
	String name;
    @Value("${Student.hobby}")
	String hobby;
    @Value("${Student.course}")
	String course;
	
    @Autowired
    Address address;
    
	public Student() {
		System.out.println("Student object get created using component");
		
	}
   	public void display() {
		System.out.println("Student name="+name+" hobby="+hobby+" course="+course+" and city is "+address.city); 
		
	}
	
}
