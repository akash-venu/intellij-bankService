package com.tekarch.boa.bankservice.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="accountId")
    private Long account_id;
    private Integer user_id;

    @Column(nullable = false, unique = true)
    private String account_number;
    private String account_type;
    private Double balance;
    private String currency;
    private LocalDateTime created_at;

    @PrePersist
    protected void onCreate() {
        this.created_at = LocalDateTime.now();
    }
}
