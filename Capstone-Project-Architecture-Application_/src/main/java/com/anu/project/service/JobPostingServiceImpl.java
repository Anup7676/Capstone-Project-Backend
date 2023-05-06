package com.anu.project.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.anu.project.domain.JobPosting;
import com.anu.project.dto.JobPostingDto;
import com.anu.project.exception.JobNotFoundException;
import com.anu.project.repository.JobPostRepository;
import com.anu.project.util.JobPostMapper;

import lombok.AllArgsConstructor;

@Transactional
@AllArgsConstructor
@Service
public class JobPostingServiceImpl implements JobPostingService {

    public JobPostRepository repository;
    public JobPostMapper mapper;

    @Override
    public Integer createNewJob(JobPostingDto jobpostingDto) {
        repository.save(mapper.toDomain(jobpostingDto));
        return 1;
    }
    @Override
    public List<JobPostingDto> all() {
         return repository.findAll()
                .stream()
                // .map( invoice -> mapper.toDto(invoice) )
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
    @Override
    public Integer deleteJobPost(Long id) throws JobNotFoundException {
        repository.deleteById(id);
        return 1;
    }
    @Override
    public Integer updateJobPost(JobPostingDto jobpostingDto) {
        repository.save(mapper.toDomain(jobpostingDto));
        return 1;
    }
    @Override
    public JobPostingDto fetchJobDetails(Long id) {
        Optional<JobPosting> op = repository.findById(id);
        return mapper.toDto(op.orElseThrow(() -> new JobNotFoundException("Job " + id + " Not Found")));
    }
    
}
