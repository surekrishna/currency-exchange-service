package com.spring.boot.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.microservices.currencyexchangeservice.bean.ExchangeValue;

@RestController
public class CurrencyExchangeController {
	
	
	@Autowired
	private Environment environment;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getCurrencyExchangeValue(@PathVariable String from, @PathVariable String to) {
		int port = Integer.parseInt(environment.getProperty("local.server.port"));
		return new ExchangeValue(1L,from,to,new BigDecimal(72),port);
	}
}
