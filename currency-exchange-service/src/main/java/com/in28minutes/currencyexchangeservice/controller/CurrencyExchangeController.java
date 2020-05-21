package com.in28minutes.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.currencyexchangeservice.models.ExchangeValue;
import com.in28minutes.currencyexchangeservice.repository.CurrencyExchangeJpaRepository;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeJpaRepository currencyExchangeJpaRepository;
	
	@GetMapping(value = "currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
		System.out.println("currency-exchange: from=:"+from);
		ExchangeValue exchangeValue = currencyExchangeJpaRepository.findByFromAndTo(from,to);				
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}
}
