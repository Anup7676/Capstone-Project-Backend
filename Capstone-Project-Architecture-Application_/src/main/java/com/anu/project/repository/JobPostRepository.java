package com.anu.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anu.project.domain.JobPosting;

public interface JobPostRepository extends JpaRepository<JobPosting,Long> {
    List<JobPosting> findAllByLocation(String location);
    
    List<JobPosting> findAllByIndustry(String industry);
    List <JobPosting> findByUsers(Long id);
}
