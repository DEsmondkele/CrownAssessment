package com.customer.db.controller;

import com.customer.db.data.dto.CustomerRequest;
import com.customer.db.data.model.Customer;
import com.customer.db.data.repository.CustomerRepo;
import com.customer.db.services.CustomerService;
import com.customer.db.services.CustomerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Service
@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
   private CustomerServiceImpl customerService;

    @PostMapping("/reg")
    public ResponseEntity<?> register(@RequestBody CustomerRequest request){
        return ResponseEntity.ok(customerService.createCustomer(request));
    }
    @GetMapping("/get")
    public List<Customer> findAllCustomers(){
        return customerService.getAllCustomer();
    }
}
