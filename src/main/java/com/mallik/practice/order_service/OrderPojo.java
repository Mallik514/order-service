package com.mallik.practice.order_service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPojo {
    private long id;
    private int quantity;
    private double amount;
    private String orderedBy;
    private String orderId;
}
