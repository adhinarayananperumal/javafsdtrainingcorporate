package com.ba.bapayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/api/payment")
public class PaymentRestController {
	
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	
	@GetMapping(value = "/getPaymentDetail")
	public ResponseEntity<String> welcome() {
		try {
			String welcomeMessage = restTemplate.exchange("http://STOCK/api/stock/stockDashbord",
					HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
					}).getBody();

			System.out.println(welcomeMessage);
			
			return new ResponseEntity<String>(welcomeMessage, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Stock dashboard", HttpStatus.OK);
		}
	}

}
