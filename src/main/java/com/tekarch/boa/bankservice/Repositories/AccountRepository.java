package com.tekarch.boa.bankservice.Repositories;

import com.tekarch.boa.bankservice.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
