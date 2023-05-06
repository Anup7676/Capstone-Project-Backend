package com.anu.project.util;

import org.springframework.stereotype.Component;

import com.anu.project.domain.JobPosting;
import com.anu.project.dto.JobPostingDto;

@Component
public class JobPostMapper {
    public JobPosting toDomain(JobPostingDto jobpostingDto){
        return new JobPosting(
            jobpostingDto.getId(),
            jobpostingDto.getJobTitle(),
            jobpostingDto.getJobDescription(),
            jobpostingDto.getLocation(),
            jobpostingDto.getIndustry(),
            jobpostingDto.getQualification(),
            jobpostingDto.getApplicationRequirement(),
            jobpostingDto.getPostedDate()
            );

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
