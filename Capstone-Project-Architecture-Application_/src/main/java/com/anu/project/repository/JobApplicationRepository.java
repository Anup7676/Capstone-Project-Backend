package com.anu.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anu.project.domain.Application;

public interface JobApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findByJobPostingId(Long jobPostId);   

}
