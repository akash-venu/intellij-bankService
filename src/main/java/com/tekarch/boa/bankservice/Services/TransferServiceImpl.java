package com.tekarch.boa.bankservice.Services;


import com.tekarch.boa.bankservice.Models.Transfer;
import com.tekarch.boa.bankservice.Repositories.TransferRepository;
import com.tekarch.boa.bankservice.Services.Interfaces.AccountService;
import com.tekarch.boa.bankservice.Services.Interfaces.TransferService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransferServiceImpl implements TransferService {

    private final TransferRepository transferRepository;

    public TransferServiceImpl(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }


    @Override
    public Transfer createTransfer(Integer sender_account_id, Integer receiver_account_id, BigDecimal amount) {
        return null;
    }
}
