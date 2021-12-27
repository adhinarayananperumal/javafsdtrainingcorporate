package icici.corebanking.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icici.corebanking.entity.Customer;
import icici.corebanking.pojo.CustomerPojo;
import icici.corebanking.repository.CustomerRepository;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerReopository;

	@Override
	public CustomerPojo saveCustomer(CustomerPojo customerPojo) {
		System.out.println("Inside Save method CustomerServiceI..mpl");

		Customer customer = new Customer();
		customer.setCustomerName(customerPojo.getCustomerName());
		customer.setAge(customerPojo.getAge());

		customerReopository.save(customer);
		
		customerPojo.setCid(customer.getCid());

		return customerPojo;

	}
	
	@Override
	public CustomerPojo getCustomer(int id) {
		Customer customer = customerReopository.getById(id);

		CustomerPojo customerPojo = new CustomerPojo();
		customerPojo.setCid(customer.getCid());
		customerPojo.setCustomerName(customer.getCustomerName());
		customerPojo.setAge(customer.getAge());

		return customerPojo;
	}

	@Override
	public List<CustomerPojo> listCustomer() {
		List<CustomerPojo> customerPojoList = new ArrayList<CustomerPojo>();

		List<Customer> cus = customerReopository.findAll();

		for (Customer customer : cus) {
			CustomerPojo customerPojo = new CustomerPojo();
			customerPojo.setCid(customer.getCid());
			customerPojo.setCustomerName(customer.getCustomerName());
			customerPojo.setAge(customer.getAge());

			customerPojoList.add(customerPojo);
		}

		return customerPojoList;
	}

	@Override
	public void update(CustomerPojo customerPojo) {
		Customer customer = customerReopository.getById(customerPojo.getCid());
		customer.setCustomerName(customerPojo.getCustomerName());
		customer.setAge(customerPojo.getAge());
	}

	@Override
	public void delete(int cusId) {
		customerReopository.deleteById(Integer.valueOf(cusId));
	}

	@Override
	public List<CustomerPojo> findByCustomerNameIgnoreCase(String customerName) {
		// TODO Auto-generated method stub
		List<CustomerPojo> customerPojoList = new ArrayList<CustomerPojo>();

		List<Customer> customerList 	= customerReopository.findByCustomerNameIgnoreCase(customerName);
		for (Customer customer : customerList) {
			CustomerPojo customerPojo = new CustomerPojo();
			customerPojo.setCid(customer.getCid());
			customerPojo.setCustomerName(customer.getCustomerName());
			customerPojo.setAge(customer.getAge());

			customerPojoList.add(customerPojo);
		}

		return customerPojoList;	
		}
	
	


}
