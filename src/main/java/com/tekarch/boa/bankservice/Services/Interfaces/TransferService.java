package com.tekarch.boa.bankservice.Services.Interfaces;

import com.tekarch.boa.bankservice.Models.Transfer;

import java.math.BigDecimal;

public interface TransferService {
    Transfer createTransfer(Integer sender_account_id, Integer receiver_account_id, BigDecimal amount);
}
