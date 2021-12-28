import axios from 'axios';

const  CUSTOMER_API_BASE_URL = 'http://localhost:8080/api/customer';

class CustomerService {

     saveCustomer(customer){
        alert("Save customer in service called..." + customer.customerName + customer.age);
        axios.post(CUSTOMER_API_BASE_URL,customer);
        return "saved successfully";
    };

}

export default new CustomerService();
