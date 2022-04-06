package com.customer.db.services;

import com.customer.db.data.dto.CustomerRequest;
import com.customer.db.data.model.Customer;

import java.util.List;

public interface CustomerService {
     Customer createCustomer(CustomerRequest request);
    List<Customer> getAllCustomer();
}
