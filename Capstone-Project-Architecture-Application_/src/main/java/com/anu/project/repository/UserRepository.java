package com.anu.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anu.project.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
