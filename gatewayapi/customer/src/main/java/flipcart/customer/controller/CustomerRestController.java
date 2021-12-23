package flipcart.customer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import flipcart.customer.pojo.CustomerPojo;

@RestController
@RequestMapping(value = "/api/customer")
public class CustomerRestController {

	@GetMapping(value = "/get/{cusid}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<CustomerPojo> getCustomer(@PathVariable(value = "cusid") String cusid) {
		CustomerPojo customerPojo = new CustomerPojo();
		try {

			customerPojo.setCustomerName("c1");
			customerPojo.setCustomerId("iq101");

			return new ResponseEntity<>(customerPojo, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(customerPojo, HttpStatus.OK);
		}
	}

}
