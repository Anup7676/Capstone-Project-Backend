package com.anu.project.service;

import java.util.List;

import com.anu.project.dto.JobPostingDto;
import com.anu.project.exception.JobNotFoundException;

public interface JobPostingService {

    Integer createNewJob(JobPostingDto jobpostingDto);
    List<JobPostingDto> all();
    Integer deleteJobPost(Long id) throws JobNotFoundException;
    JobPostingDto fetchJobDetails(Long id) throws JobNotFoundException;
    Integer updateJobPost(JobPostingDto jobpostingDto);
    
}
