package org.sid.bankaccountservice.web;

import org.sid.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
    private BankAccountRepository bankAccountRepository;

    public AccountRestController(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
}
