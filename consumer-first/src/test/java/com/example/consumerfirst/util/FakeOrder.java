package com.example.consumerfirst.util;

import com.example.consumerfirst.domain.Order;
import com.example.consumerfirst.domain.Status;
import com.example.consumerfirst.service.messaging.event.OrderEvent;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FakeOrder {
    public static OrderEvent getOrderEvent(){
        return new OrderEvent(
                "pensil",
                "0000003",
                100,
                new BigDecimal(0.99)
        );
    }

    public static Order getOrder(){
        return new Order(
                1L,
                "pensil",
                "0000003",
                100,
                new BigDecimal(0.99),
                new BigDecimal(99.0),
                LocalDateTime.of(2023,06,16,15,56,00),
                Status.APPROVED
        );
    }
}
