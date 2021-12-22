package loanmanagement.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import loanmanagement.customerservice.CustomerPojo;
import loanmanagement.customerservice.pojo.AccountPojo;


@RequestMapping("/api/customer")
@RestController
public class CustomerController {
	
    @Autowired
    private RestTemplate restTemplate;



	@GetMapping(value = "/getCustomerDetails")
	public CustomerPojo getCustomerDetails() {

		CustomerPojo customerPojo = new CustomerPojo();
		AccountPojo accountPojo = restTemplate.getForObject("http://ACCOUNT-SERVICES/api/account/getacountdetails",
				AccountPojo.class);
		customerPojo.setAccountPojo(accountPojo);
		return customerPojo;
	}
	
	 
}
