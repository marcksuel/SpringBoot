package com.marcksuel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcksuel.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
