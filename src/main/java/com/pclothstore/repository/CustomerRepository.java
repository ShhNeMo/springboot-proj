package com.pclothstore.repository;

import com.pclothstore.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

    void deleteByEmail(String email);
    Customer findCustomerByEmail(String email);

}
