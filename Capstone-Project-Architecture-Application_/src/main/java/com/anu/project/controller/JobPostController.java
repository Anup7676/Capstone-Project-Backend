package com.anu.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anu.project.dto.JobPostingDto;
import com.anu.project.service.JobPostingService;
import com.anu.project.util.AppResponse;

import lombok.AllArgsConstructor;

@CrossOrigin
@AllArgsConstructor
@RequestMapping(value ="/jobpost")
@RestController
public class JobPostController {
    private final JobPostingService service;

    @CrossOrigin
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> createNewJob(@RequestBody JobPostingDto jobpostingDto) {
        final Integer sts = service.createNewJob(jobpostingDto);
        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                .sts("success")
                .msg("Job Added Successfully")
                .bd(sts)
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @CrossOrigin
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<List<JobPostingDto>>> all() {
        List<JobPostingDto> jobpostingDtos = service.all();

        AppResponse<List<JobPostingDto>> response = AppResponse.<List<JobPostingDto>>builder()
                .sts("success")
                .msg("JobPost")
                .bd(jobpostingDtos)
                .build();

        return ResponseEntity.ok().body(response);
    }

    @CrossOrigin
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> deleteInvoice(@PathVariable Long id) {

        final Integer sts = service.deleteJobPost(id);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                .sts("success")
                .msg("Invoice Deleted Successfully")
                .bd(sts)
                .build();

        return ResponseEntity.status(200).body(response);
    }

    @CrossOrigin
    @PutMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> updateNewInvoice(@RequestBody JobPostingDto dto) {

        final Integer sts = service.updateJobPost(dto);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                .sts("success")
                .msg("Job Updated Successfully")
                .bd(sts)
                .build();

        return ResponseEntity.ok().body(response);
    }
}
