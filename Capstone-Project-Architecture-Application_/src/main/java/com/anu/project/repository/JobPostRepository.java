package com.anu.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anu.project.domain.JobPosting;

public interface JobPostRepository extends JpaRepository<JobPosting,Long> {
    
}
