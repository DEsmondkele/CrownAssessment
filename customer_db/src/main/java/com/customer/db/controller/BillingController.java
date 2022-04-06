package com.customer.db.controller;

import com.customer.db.data.dto.BillingRequest;
import com.customer.db.services.BillingServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Service
@RestController
@RequestMapping("billing")
public class BillingController {
    @Autowired
    private BillingServiceImpl billingService;
    @PostMapping("/add")
    public ResponseEntity<?> createBilling(BillingRequest request){
        return ResponseEntity.ok(billingService.createBill(request));
    }

}
