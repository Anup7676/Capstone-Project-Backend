package com.anu.project.service;

import java.util.List;

import com.anu.project.dto.JobListDto;
import com.anu.project.dto.UserJobPostDto;

public interface UserService {
    Integer applyJob(Long userId,Long jobPostId);
    
    List<UserJobPostDto> getAllJobs(Long userId);

    List<JobListDto> getJobsByLocation(String location);
  
    UserJobPostDto getJob(Long userId,Long jobPostId);
}

