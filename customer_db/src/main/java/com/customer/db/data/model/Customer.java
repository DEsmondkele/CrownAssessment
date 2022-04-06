package com.customer.db.data.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String firstName;
    private String lastName;
    @Column(nullable = false)
    @NotNull
    private  String email;
    @OneToOne
    private Billing billingDetail;

    public Customer(Integer id,
                    String firstName, String lastName,
                    String email, Billing billingDetail) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.billingDetail = billingDetail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "account number=" + billingDetail.getAccountNumber()+
                "tariff=" +billingDetail.getAccountNumber()+
                '}';
    }
}
