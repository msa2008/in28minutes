package com.in28minutes.studentrestfulwebservice.exceptions;

import java.util.Date;

public class ExceptionResponse {
	private Date timestamp;
	private String message;
	private String details;
	private String status;
	
	public ExceptionResponse(Date timestamp, String message, String details, String status) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.status = status;
	}
	public ExceptionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
	public String getStatus() {
		return status;
	}
	
	
}
