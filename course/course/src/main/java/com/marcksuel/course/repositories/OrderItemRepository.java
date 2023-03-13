package com.marcksuel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcksuel.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
