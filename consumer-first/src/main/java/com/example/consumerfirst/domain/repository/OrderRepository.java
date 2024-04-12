package com.example.consumerfirst.domain.repository;

import com.example.consumerfirst.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
