package com.amazon.amazonorder.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.amazonorder.client.PaymentClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/api/order")
public class OrderController {

	private static final Logger LOG = Logger.getLogger(OrderController.class.getName());

	@Autowired
	private PaymentClient paymentClient;

	@HystrixCommand(fallbackMethod = "defaultPayment")
	@GetMapping(value = "/getOrder")
	public String getOrder() {
		LOG.info("Inside OrderController ..");

		String response = (String) paymentClient.getPayment();
		return response;
	}
	
	/*
	 * @HystrixCommand(fallbackMethod = ”defaultStores”, commandProperties = {
	 * 
	 * @ HystrixProperty(name = ”circuitBreaker.errorThresholdPercentage”, value =
	 * ”20”),
	 * 
	 * @HystrixProperty(name = ”circuitBreaker.sleepWindowInMilliseconds”, value =
	 * ”1000”) })
	 */

	public String defaultPayment() {
		System.out.println("");
		return "Payment details currently not available , try after some time";
	}

}
