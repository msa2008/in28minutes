package com.in28minutes.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.in28minutes.currencyconversionservice.model.CurrencyConversionBean;
import com.in28minutes.currencyconversionservice.model.ExchangeValue;
import com.in28minutes.currencyconversionservice.service.CurrencyExchangeServiceProxy;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;

	@GetMapping("/currency-conversion-service/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertToCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		System.out.println("quantity------------" + quantity);
		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<ExchangeValue> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8001/currency-exchange/from/{from}/to/{to}", ExchangeValue.class, uriVariables);

		CurrencyConversionBean currencyConversionBean = new CurrencyConversionBean();
		if (responseEntity != null) {
			ExchangeValue exchangeValue = responseEntity.getBody();

			currencyConversionBean.setTo(to);
			currencyConversionBean.setFrom(from);
			currencyConversionBean.setQuantity(quantity);
			currencyConversionBean.setPort(exchangeValue.getPort());

			currencyConversionBean.setId(exchangeValue.getId());
			currencyConversionBean.setCurrancyMultipal(exchangeValue.getConversionMultiple());
			currencyConversionBean.setTotalAmount(quantity.multiply(exchangeValue.getConversionMultiple()));
		} else {
			currencyConversionBean = new CurrencyConversionBean(1L, from, to, quantity, BigDecimal.ONE, BigDecimal.ONE);
		}
		return currencyConversionBean;
	}
	
	
	@GetMapping("/currency-conversion-service-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertToCurrencyfeign(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		System.out.println("quantity------------" + quantity);
		
		
		ExchangeValue exchangeValue  = proxy.retriveExchangeValue(from, to);
	
		CurrencyConversionBean currencyConversionBean = new CurrencyConversionBean();
		if (exchangeValue != null) {

			
			currencyConversionBean.setTo(to);
			currencyConversionBean.setFrom(from);
			currencyConversionBean.setQuantity(quantity);
			currencyConversionBean.setPort(exchangeValue.getPort());

			currencyConversionBean.setId(exchangeValue.getId());
			currencyConversionBean.setCurrancyMultipal(exchangeValue.getConversionMultiple());
			currencyConversionBean.setTotalAmount(quantity.multiply(exchangeValue.getConversionMultiple()));
		}else {		
			currencyConversionBean=new CurrencyConversionBean(1L, from, to, quantity, BigDecimal.ONE,BigDecimal.ONE);
		}return currencyConversionBean;
}
}
