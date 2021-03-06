package com.in28minutes.studentrestfulwebservice.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
/*@JsonFilter("SomeBeanFilter")   <----------for dynamic filtering*/
public class Student {

	@Id
	@GeneratedValue
	/*@Pattern(regexp = "[\\s]*[0-9]*[1-9]+", message = "id must be postive number")*/	
	private Integer id;

	@Size(min = 2, message = "minimum size should be {min}")
	private String name;

	@Size(min = 2, message = "minimum size should be {min}")
	private String address;

	@Past(message = "date must be previous date")
	private Date dob;
	//private List<Subject> subjects;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String address, Date dob) {
		super();	
		this.name = name;
		this.address = address;
		this.dob = dob;		
	}
	
/*	public Student(Integer id, String name, String address, Date dob, List<Subject> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.subjects = subjects;
	}*/

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", dob=" + dob + /*", subjects="
				+ subjects +*/ "]";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	/*public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}*/

}
