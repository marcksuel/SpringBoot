package com.marcksuel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcksuel.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
