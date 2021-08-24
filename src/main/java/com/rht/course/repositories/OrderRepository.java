package com.rht.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rht.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
