package com.in28minutes.mircoservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.mircoservices.limitsservice.model.Configuration;
import com.in28minutes.mircoservices.limitsservice.model.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	@Autowired
	Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}
}
