package com.example.consumerfirst.service.messaging.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {

    private String productName;
    private String barCode;
    private int quantity;
    private BigDecimal price;

}
