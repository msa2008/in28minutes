package com.in28minutes.currencyconversionservice.model;

import java.math.BigDecimal;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class ExchangeValue {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private Integer port;

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
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

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

}
