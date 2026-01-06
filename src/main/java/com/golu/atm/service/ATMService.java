package com.golu.atm.service;

import org.springframework.stereotype.Service;

@Service
public class ATMService {

    // Dummy balance for example
    private double balance = 10000.0;

    // Check balance
    public String checkBalance(String accountNumber) {
        return "Account " + accountNumber + " has balance: ₹" + balance;
    }

    // Withdraw money
    public String withdrawMoney(String accountNumber, double amount) {
        if (amount <= 0) {
            return "Invalid amount.";
        } else if (amount > balance) {
            return "Insufficient balance!";
        } else {
            balance -= amount;
            return "₹" + amount + " withdrawn. Remaining balance: ₹" + balance;
        }
    }

    // Deposit money
    public String depositMoney(String accountNumber, double amount) {
        if (amount <= 0) {
            return "Invalid amount.";
        } else {
            balance += amount;
            return "₹" + amount + " deposited. New balance: ₹" + balance;
        }
    }
}
