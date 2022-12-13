package com.microDemo.Order.Common;

import com.microDemo.Order.Entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private Order order;
    private String transaction_Id;
    private double amount;
    private String message;
}
