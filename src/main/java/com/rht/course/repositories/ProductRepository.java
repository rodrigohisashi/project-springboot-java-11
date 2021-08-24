package com.rht.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rht.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
