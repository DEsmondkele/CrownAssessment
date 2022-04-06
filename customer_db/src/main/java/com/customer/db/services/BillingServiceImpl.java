package com.customer.db.services;

import com.customer.db.data.dto.BillingRequest;
import com.customer.db.data.model.Billing;
import com.customer.db.data.repository.BillingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingServiceImpl implements BillingService {
    @Autowired
    BillingRepo  billingRepo;
    @Override
    public Billing createBill(BillingRequest request) {
        if (request == null)throw new IllegalArgumentException("No null bill");
        Billing billing = Billing.builder()
                .accountNumber(Integer.parseInt(BillingRequest.setAccountNumber()))
                .tariff(request.getTariff())
                .build();
        return billingRepo.save(billing);
    }


}
