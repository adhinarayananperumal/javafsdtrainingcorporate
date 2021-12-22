package com.amazon.amazonorder.client;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="amazonpayment",url = "http://localhost:30101/api/payment")
public interface PaymentClient {

	@GetMapping("/getPayment")
	@LoadBalanced
	String getPayment();
}
