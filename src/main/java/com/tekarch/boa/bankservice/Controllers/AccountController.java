package com.tekarch.boa.bankservice.Controllers;

import com.tekarch.boa.bankservice.Models.Account;
import com.tekarch.boa.bankservice.Services.Interfaces.AccountService;
import com.tekarch.boa.bankservice.Services.Services.AccountServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountServiceImpl accountServiceImpl;

    private final AccountService accountService;

    public AccountController(AccountServiceImpl accountServiceImpl, AccountService accountService) {
        this.accountServiceImpl = accountServiceImpl;
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<Account> addAccount(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.addAccount(account));
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAllAccounts() {
        return ResponseEntity.ok(accountService.getAllAccounts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable Long id) {
        return ResponseEntity.ok(accountService.getAccountById(id));
    }

    @PutMapping("/{id}/balance")
    public ResponseEntity<?> updateAccountBalance(@PathVariable Long id, @RequestParam Double balance) {
        accountService.updateAccountBalance(id, balance);
        return ResponseEntity.ok("Balance updated successfully.");
    }

}
