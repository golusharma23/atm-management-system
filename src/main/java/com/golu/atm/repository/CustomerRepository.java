package com.golu.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.golu.atm.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
