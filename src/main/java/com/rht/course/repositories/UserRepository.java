package com.rht.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rht.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
