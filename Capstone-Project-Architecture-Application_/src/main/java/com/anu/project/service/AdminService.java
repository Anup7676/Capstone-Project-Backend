package com.anu.project.service;

import java.util.List;

import com.anu.project.dto.AdminUserJobDto;
import com.anu.project.dto.JobListDto;
import com.anu.project.dto.JobPostingDto;
import com.anu.project.dto.UpdateJobDto;

public interface AdminService {
    Integer createNewJob(JobPostingDto dto);
    List<JobListDto> getAllJob();
    Integer deleteJobPost(Long id) ;
    JobPostingDto getJob(Long id) ;
    Integer updateJobPost(UpdateJobDto dto);
    List<AdminUserJobDto> getAllUserJobs();
    List<AdminUserJobDto> searchUserJobsByEmail(String email);

}
