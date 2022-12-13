package com.microDemo.Order.Common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private int payment_id;
    private String payment_status;
    private String transaction_id;
    private int OrderId;
    private double amount;


}
