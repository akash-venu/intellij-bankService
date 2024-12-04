package com.tekarch.boa.bankservice.Services.Services;

import com.tekarch.boa.bankservice.Models.Account;
import com.tekarch.boa.bankservice.Repositories.AccountRepository;
import com.tekarch.boa.bankservice.Services.Interfaces.AccountService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private static final Logger logger = LogManager.getLogger(AccountServiceImpl.class);

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account addAccount(Account account) {
        logger.info("Adding account " + account);
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        logger.info("Getting all accounts");
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(Long accountId) {
        logger.info("Fetching account by ID: {}", accountId);
        return accountRepository.findById(accountId)
                .orElseThrow(() -> new IllegalArgumentException("Account with ID " + accountId + " not found."));
    }

    @Override
    public void updateAccountBalance(Long accountId, Double newBalance) {
        logger.info("Updating balance for account ID: {} to {}", accountId, newBalance);
        Account account = getAccountById(accountId); // Reuse existing method
        account.setBalance(newBalance);
        accountRepository.save(account);
    }
}
