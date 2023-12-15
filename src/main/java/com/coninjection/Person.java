package com.coninjection;

import java.util.List;

public class Person {
	public Person(List<String> list) {
		super();
		this.list = list;
	}

	private String name;
	private int id;
	private Certificate cft;
	private List<String> list;
	
	public Person(String name, int id, Certificate cft, List<String> list) {
		super();
		this.name = name;
		this.id = id;
		this.cft = cft;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", cft=" + cft + ", list=" + list + "]";
	}
}
