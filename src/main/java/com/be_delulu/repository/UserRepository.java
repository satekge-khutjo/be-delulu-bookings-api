package com.be_delulu.repository;

import com.be_delulu.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // Custom query
    User findByEmail(String email);
}