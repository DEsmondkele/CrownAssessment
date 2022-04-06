package com.customer.db.services;

import com.customer.db.data.dto.CustomerRequest;
import com.customer.db.data.model.Customer;
import com.customer.db.data.repository.CustomerRepo;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Builder
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    @Override
    public Customer createCustomer(CustomerRequest request) {
        if (request == null)throw  new IllegalArgumentException("customer can not be  null");
        Customer customer = Customer.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .billingDetail(request.getBillingDetails())
                .build();
        return customerRepo.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return  customerRepo.findAll();
    }
}
