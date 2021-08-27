package com.rht.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rht.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
