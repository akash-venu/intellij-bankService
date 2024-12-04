package com.tekarch.boa.bankservice.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transfers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transfer_id;

    @Column( nullable = false)
    private Integer sender_account_id;

    @Column(nullable = false)
    private Integer receiver_account_id;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(length = 20, nullable = false)
    private String status;

    @Column(updatable = false)
    private LocalDateTime initiated_at;

    private LocalDateTime completed_at;
}
