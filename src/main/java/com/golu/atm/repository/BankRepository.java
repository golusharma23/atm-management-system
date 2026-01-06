package com.golu.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.golu.atm.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {
}

