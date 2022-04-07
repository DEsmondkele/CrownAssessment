package com.customer.db.data.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.security.SecureRandom;
import java.util.Objects;


@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Billing {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    private String accountNumber;
    private String tariff;

}
