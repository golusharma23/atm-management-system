package com.golu.atm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.golu.atm.service.ATMService;

@RestController
@RequestMapping("/atm")
public class ATMController {

    @Autowired
    private ATMService atmService;

    // Example endpoint: Check balance
    @GetMapping("/balance/{accountNumber}")
    public String getBalance(@PathVariable String accountNumber) {
        return atmService.checkBalance(accountNumber);
    }

    // Example endpoint: Withdraw money
    @PostMapping("/withdraw")
    public String withdraw(@RequestParam String accountNumber, @RequestParam double amount) {
        return atmService.withdrawMoney(accountNumber, amount);
    }

    // Example endpoint: Deposit money
    @PostMapping("/deposit")
    public String deposit(@RequestParam String accountNumber, @RequestParam double amount) {
        return atmService.depositMoney(accountNumber, amount);
    }
}
