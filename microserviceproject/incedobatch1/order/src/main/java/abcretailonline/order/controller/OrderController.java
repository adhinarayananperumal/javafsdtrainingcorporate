package abcretailonline.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import abcretailonline.order.pojo.OrderPojo;
import abcretailonline.order.pojo.PaymentPojo;

@RequestMapping("/api/order")
@RestController
public class OrderController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/getorderdetails")
	public OrderPojo getOrderDetails() {

		OrderPojo orderPojo = new OrderPojo();
		orderPojo.setOrderName("abc12");
		orderPojo.setOrderName("monad1234");
		PaymentPojo paymentPojo = restTemplate.getForObject("http://ABCPAYMENT-SERVICES/api/payment/getpaymentdetail",
				PaymentPojo.class);
		orderPojo.setPaymentPojo(paymentPojo);
		return orderPojo;
	}
}
