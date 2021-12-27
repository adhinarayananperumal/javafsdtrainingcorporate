package icici.corebanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import icici.corebanking.pojo.CustomerPojo;
import icici.corebanking.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping(value = "/welcome")
	public String welcomeCall() {
		return "Welcome to Citi Bank";
	}

	@PostMapping(value = "/save")
	public CustomerPojo saveCustomer(@RequestBody CustomerPojo customerPojo) {

		customerPojo = customerService.saveCustomer(customerPojo);

		return customerPojo;
	}

	@GetMapping("/get/{customerId}")
	public CustomerPojo getCustomer(@PathVariable("customerId") int customerId) {

		CustomerPojo customerPojo = customerService.getCustomer(customerId);

		return customerPojo;
	}

	@GetMapping("/list")
	public List<CustomerPojo> listCustomer() {
		List<CustomerPojo> listCustomer = customerService.listCustomer();

		return listCustomer;
	}

	@PostMapping(value = "/update")
	public CustomerPojo updateCustomer(@RequestBody CustomerPojo customerPojo) {

		customerService.update(customerPojo);
		customerPojo = customerService.getCustomer(customerPojo.getCid());
		return customerPojo;
	}

	@DeleteMapping(value = "/delete/{customerId}")
	public String deleteCustomer(@PathVariable("customerId") int customerId) {
		customerService.delete(customerId);
		return "Customer deleted successfully with customer id " + customerId;
	}

	@GetMapping("/api/getCustomerListByName/{customerName}")
	public List<CustomerPojo> findByCustomerNameIgnoreCase(@PathVariable("customerName") String customerName) {

		List<CustomerPojo> listCustomer = customerService.findByCustomerNameIgnoreCase(customerName);

		return listCustomer;
	}

	@PostMapping("/api/search")
	public List<CustomerPojo> search(@RequestBody CustomerPojo customerPojo) {
		List<CustomerPojo> listCustomer = customerService.listCustomer();

		return listCustomer;
	}

}