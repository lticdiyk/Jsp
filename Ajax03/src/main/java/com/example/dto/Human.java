package com.example.dto;

import java.io.Serializable;

// lombok - setter, getter
public class Human implements Serializable{

	private String name;
	private int age;
	
	public Human() {
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}
