package com.in28minutes.jpain10steps.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Student {

	@Pattern(regexp = "[\\s]*[0-9]*[1-9]+", message = "id must be postive number")
	@Id
	@GeneratedValue
	private Integer id;

	@Size(min = 2, message = "minimum size should be {min}")
	private String name;

	@Size(min = 2, message = "minimum size should be {min}")
	private String address;

/*	@Past(message = "date must be previous date")
	private Date dob;*/
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student( String name, String address, Date dob) {
		super();
		this.name = name;
		this.address = address;
		//this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + /*", dob=" + dob + */"]";
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

/*	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	*/

}
