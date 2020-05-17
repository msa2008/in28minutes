package com.in28minutes.studentrestfulwebservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer maxMarks;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Subject(String name, Integer maxMarks) {
		super();
		this.name = name;
		this.maxMarks = maxMarks;
	}

	public Subject(Integer id, String name, Integer maxMarks) {
		super();
		this.id = id;
		this.name = name;
		this.maxMarks = maxMarks;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", maxMarks=" + maxMarks + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(Integer maxMarks) {
		this.maxMarks = maxMarks;
	}

}
