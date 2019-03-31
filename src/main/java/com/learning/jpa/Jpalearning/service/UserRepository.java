package com.learning.jpa.Jpalearning.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.jpa.Jpalearning.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
