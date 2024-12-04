package com.tekarch.boa.bankservice.Repositories;

import com.tekarch.boa.bankservice.Models.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, Long> {

}
