package com.customer.db.data.repository;

import com.customer.db.data.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
