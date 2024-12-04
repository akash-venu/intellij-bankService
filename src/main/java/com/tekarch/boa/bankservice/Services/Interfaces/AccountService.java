package com.tekarch.boa.bankservice.Services.Interfaces;

import com.tekarch.boa.bankservice.Models.Account;

import java.util.List;

public interface AccountService {
    Account addAccount(Account account);
    List<Account> getAllAccounts();
    Account getAccountById(Long accountId);
    void updateAccountBalance(Long accountId, Double newBalance);
}
