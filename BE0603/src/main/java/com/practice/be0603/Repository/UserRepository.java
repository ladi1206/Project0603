package com.practice.be0603.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.be0603.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}