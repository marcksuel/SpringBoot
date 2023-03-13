package com.marcksuel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcksuel.course.entities.*;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
