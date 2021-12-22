package abcretailonline.abcpayment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import abcretailonline.abcpayment.pojo.PaymentPojo;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

	@GetMapping(value = "/getpaymentdetail")
	public PaymentPojo getPaymentDetail() {

		PaymentPojo paymentPojo = new PaymentPojo();
		paymentPojo.setPaymentId(123);
		paymentPojo.setPaymentAmount(300000);
		paymentPojo.setPaymentType("Cash");

		return paymentPojo;
	}

}
