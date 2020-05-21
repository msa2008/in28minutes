package com.in28minutes.currencyconversionservice.model;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	private Long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal currancyMultipal;
	private BigDecimal totalAmount;
	private Integer port;
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public CurrencyConversionBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal quantity, BigDecimal currancyMultipal,
			BigDecimal totalAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.currancyMultipal = currancyMultipal;
		this.totalAmount = totalAmount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getCurrancyMultipal() {
		return currancyMultipal;
	}
	public void setCurrancyMultipal(BigDecimal currancyMultipal) {
		this.currancyMultipal = currancyMultipal;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
