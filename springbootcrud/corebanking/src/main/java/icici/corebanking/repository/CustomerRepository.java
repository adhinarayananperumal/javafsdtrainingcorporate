package icici.corebanking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import icici.corebanking.entity.Customer;

//https://javadeveloperzone.com/spring/spring-jpa-like-query-example/

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByCustomerNameIgnoreCase(String customerName);
    
    @Query("select c from Customer c where c.customerName like %:customerName%")
    List<Customer> findByCustomerNameContaining(@Param("customerName") String customerName); 
    // fetch list of employee containing name
    
    @Query("SELECT * FROM Customer WHERE customerName LIKE '%customerName';")
    List<Customer> findByCustomerNameEndsWith(@Param("customerName") String customerName);


}
