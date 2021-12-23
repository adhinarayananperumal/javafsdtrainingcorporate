package school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import school.pojo.CustomerPojo;
import school.pojo.SchoolPojo;

@RestController
@RequestMapping(value = "/api/school")
public class SchoolRestController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/get/{schoolId}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<SchoolPojo> getCustomer(@PathVariable(value = "schoolId") String schoolId) {
		SchoolPojo schoolPojo = new SchoolPojo();
		CustomerPojo customerPojo = new CustomerPojo();

		try {

			schoolPojo.setSchoolName("SVS");
			schoolPojo.setSchoolId(schoolId);
			CustomerPojo customerPojoObj = restTemplate.exchange("http://CUSTOM-SERVICE/api/customer/get/{schoolId}",
					HttpMethod.GET, null, new ParameterizedTypeReference<CustomerPojo>() {
					}, customerPojo).getBody();

			System.out.println("Response Received as " + customerPojoObj.getCustomerId());

			schoolPojo.setCustomerPojo(customerPojoObj);

			return new ResponseEntity<>(schoolPojo, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(schoolPojo, HttpStatus.OK);
		}
	}

	CustomerPojo getCustomerDetails() {
		CustomerPojo customerPojo = new CustomerPojo();

		CustomerPojo customerPojoObj = restTemplate.exchange("http://CUSTOM-SERVICE/api/customer/get/{schoolId}",
				HttpMethod.GET, null, new ParameterizedTypeReference<CustomerPojo>() {
				}, customerPojo).getBody();
		

		return customerPojoObj;
	}
	
    private CustomerPojo getDummyCustomerPojo() {
    	 
        System.out.println("Student Service is down!!! fallback route enabled...");
        
		CustomerPojo customerPojo = new CustomerPojo();
		customerPojo.setCustomerName("down");
		customerPojo.setCustomerId("123456");
		customerPojo.setStatus("customer Service is down!!! fallback route enabled...");

 
        return customerPojo;
    }


	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
