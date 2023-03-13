package com.marcksuel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcksuel.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
