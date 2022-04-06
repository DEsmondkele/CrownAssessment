package com.customer.db.data.dto;

import com.customer.db.data.model.Billing;
import lombok.Data;

@Data
public class CustomerRequest {
    private String firstName;
    private String lastName;
    private String email;
    private Billing billingDetails;

}
