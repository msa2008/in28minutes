package com.in28minutes.studentrestfulwebservice.exceptions;

public class StudentNotFoundException extends RuntimeException {
	public StudentNotFoundException(String message) {
		super(message);
	}
}
