package com.amazon.amazonpayment;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/payment")
public class PaymentController {

	private static final Logger LOG = Logger.getLogger(PaymentController.class.getName());

	@GetMapping(value = "/getPayment")
	public String getPayment() {
		LOG.info("Inside PaymentController ..");
		System.out.println("sleeping");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "pay23456";
	}

}
