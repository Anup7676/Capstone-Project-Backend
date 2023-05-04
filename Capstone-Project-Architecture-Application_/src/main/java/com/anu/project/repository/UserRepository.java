package com.anu.project.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.anu.project.domain.User;


public interface UserRepository extends JpaRepository<User, Long>{
    
    Optional<User> findByUserNameAndPassword(String userName, String password);
}
