package com.spring.studentservice.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private String className;
	
	public Student() {
		
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", className=" + className + "]";
	}


	public Student(String name, String className) {
		super();
		this.name = name;
		this.className = className;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	

}
