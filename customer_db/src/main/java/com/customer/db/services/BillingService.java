package com.customer.db.services;

import com.customer.db.data.dto.BillingRequest;
import com.customer.db.data.model.Billing;

public interface BillingService {
    Billing createBill(BillingRequest request);
}
