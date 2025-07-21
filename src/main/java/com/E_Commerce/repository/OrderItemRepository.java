package com.E_Commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.E_Commerce.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
