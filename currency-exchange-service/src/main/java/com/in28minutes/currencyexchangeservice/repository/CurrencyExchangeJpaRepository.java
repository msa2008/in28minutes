package com.in28minutes.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28minutes.currencyexchangeservice.models.ExchangeValue;

@Repository
public interface CurrencyExchangeJpaRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from,String to);
}
