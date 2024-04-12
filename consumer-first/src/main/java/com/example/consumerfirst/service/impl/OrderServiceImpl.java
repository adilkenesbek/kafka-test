package com.example.consumerfirst.service.impl;

import com.example.consumerfirst.domain.Order;
import com.example.consumerfirst.domain.Status;
import com.example.consumerfirst.service.OrderService;
import com.example.consumerfirst.service.dto.OrderDto;
import com.example.consumerfirst.domain.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class OrderServiceImpl implements OrderService {

    private final OrderRepository ordersRepository;

    @Override
    @Transactional
    public Order save(OrderDto clientDto) {

        Order order= Order.builder()
                .productName(clientDto.getProductName())
                .barCode(clientDto.getBarCode())
                .quantity(clientDto.getQuantity())
                .price(clientDto.getPrice())
                .amount(new BigDecimal(clientDto.getQuantity()).multiply(clientDto.getPrice()))
                .orderDate(LocalDateTime.now())
                .status(Status.APPROVED)
                .build();

        ordersRepository.save(order);

        log.info("Save order");

        return order;
    }
}
