package com.spring.boot.microservices.currencyexchangeservice.bean;

import java.math.BigDecimal;

public class ExchangeValue {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionResult;
	
	public ExchangeValue() { }
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionResult) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionResult = conversionResult;
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

	public BigDecimal getConversionResult() {
		return conversionResult;
	}

	public void setConversionResult(BigDecimal conversionResult) {
		this.conversionResult = conversionResult;
	}
				
}