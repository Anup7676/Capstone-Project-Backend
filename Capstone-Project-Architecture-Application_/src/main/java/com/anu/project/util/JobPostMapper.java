package com.anu.project.util;

import org.springframework.stereotype.Component;

import com.anu.project.domain.JobPosting;
import com.anu.project.dto.JobPostingDto;

@Component
public class JobPostMapper {
    public JobPosting toDomain(JobPostingDto jobpostingDto){
        return JobPosting.builder()
            .id(jobpostingDto.getId())
            .jobTitle(jobpostingDto.getJobTitle())
            .jobDescription(jobpostingDto.getJobDescription())
            .location(jobpostingDto.getLocation())
            .industry(jobpostingDto.getIndustry())
            .qualification(jobpostingDto.getQualification())
            .applicationRequirement(jobpostingDto.getApplicationRequirement())
            .postedDate(jobpostingDto.getPostedDate())
            .build();

    }
    public JobPostingDto toDto(JobPosting domain){
        return new JobPostingDto(
            domain.getId(),
            domain.getJobTitle(),
            domain.getJobDescription(),
            domain.getLocation(),
            domain.getIndustry(),
            domain.getQualification(),
            domain.getApplicationRequirement(),
            domain.getPostedDate()
            
            );
    }

}
