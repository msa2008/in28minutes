package com.in28minutes.mircoservices.limitsservice.model;


public class LimitConfiguration {
	private int minimum;
	private int maximum;
	public LimitConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LimitConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
}
