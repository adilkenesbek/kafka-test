package com.example.consumerfirst.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",
            updatable = false)
    private Long id;
    @Column(name="product_name",
            nullable = false)
    private String productName;
    @Column(name="bar_code",
            nullable = false)
    private String barCode;
    @Column(name="quantity",
            nullable = false)
    private int quantity;
    @Column(name="price")
    private BigDecimal price;
    @Column(name="amount")
    private BigDecimal amount;
    @Column(name="order_date",
            nullable = false, updatable = false)
    private LocalDateTime orderDate;
    @Column(name="status",
            nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Status status;
}
