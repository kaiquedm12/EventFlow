package com.example.eventflow.domain.repository;

import com.example.eventflow.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
