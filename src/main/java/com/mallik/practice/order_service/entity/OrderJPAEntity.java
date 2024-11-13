package com.mallik.practice.order_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders",schema = "myorders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderJPAEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int quantity;
    private double amount;
    private String orderedBy;
    private String orderId;
}
