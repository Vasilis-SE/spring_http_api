package com.springapi.dao;


import java.util.Date;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDAO {
    private int transactionId;
    private int accountId;
    private double amount;
    private String type;
    private Date date;
}
