package com.koffee.orderservice.orderservice.repo;


import com.koffee.orderservice.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
