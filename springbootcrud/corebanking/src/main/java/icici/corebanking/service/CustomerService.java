package icici.corebanking.service;

import java.util.List;

import icici.corebanking.entity.Customer;
import icici.corebanking.pojo.CustomerPojo;

public interface CustomerService {

	CustomerPojo saveCustomer(CustomerPojo customerPojo);
	
	CustomerPojo getCustomer (int id);
	
	List<CustomerPojo> listCustomer ();
	
	void update (CustomerPojo customerPojo);
	
	void delete (int cusId);
	
    List<CustomerPojo> findByCustomerNameIgnoreCase(String customerName);


}
