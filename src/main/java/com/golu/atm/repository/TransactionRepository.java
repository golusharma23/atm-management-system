package com.golu.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.golu.atm.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
