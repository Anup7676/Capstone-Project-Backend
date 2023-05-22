package com.anu.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anu.project.dto.ApplicationDto;
import com.anu.project.dto.CreateUserDto;
import com.anu.project.dto.LoginDto;
import com.anu.project.dto.UserDto;
import com.anu.project.service.UserService;
import com.anu.project.util.AppResponse;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@CrossOrigin
@RequestMapping(value = "/user")
@RestController
public class UserController {
    
    private final UserService service;

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<AppResponse<Integer>> signup(@Valid @RequestBody CreateUserDto dto) {
        final Integer sts = service.signup(dto);

        AppResponse<Integer> res = AppResponse.<Integer>builder()
                                                .sts("success")
                                                .msg("User Created")
                                                .bd(sts)
                                                .build();

        return ResponseEntity.ok().body(res);
    }

    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<AppResponse<UserDto>> login(@Valid @RequestBody LoginDto dto) {
        final UserDto resDto = service.login(dto);

        AppResponse<UserDto> res = AppResponse.<UserDto>builder()
                                                .sts("success")
                                                .msg("Login Success")
                                                .bd(resDto)
                                                .build();

        return ResponseEntity.ok().body(res);
    }

    @CrossOrigin
    @PostMapping(value = "/{userId}/jobpost/{jobPostId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> newApplication(@Valid @PathVariable Long userId, @PathVariable Long jobPostId) {
        Integer sts = service.createJobApplication(userId, jobPostId);
        AppResponse<Integer> response = AppResponse.<Integer>builder()
                .sts("success")
                .msg("new Job Applied successfully.")
                .bd(sts)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @CrossOrigin
    @GetMapping(value = "/getuserApplication/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<List<ApplicationDto>>> findAll(@PathVariable Long userId) {
        List<ApplicationDto> sts=service.getAllApplicattions(userId);
        AppResponse<List<ApplicationDto>> response=AppResponse.<List<ApplicationDto>>builder()
                    .sts("success")
                    .msg("All  Application")
                    .bd(sts)
                    .build();
              return ResponseEntity.ok().body(response);


    }

    @GetMapping(value = "/getApplicationhistory/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<List<ApplicationDto>>> findAllHistory(@PathVariable Long userId) {
        List<ApplicationDto> sts=service.getApplicationHistory(userId);
        AppResponse<List<ApplicationDto>> response=AppResponse.<List<ApplicationDto>>builder()
                    .sts("success")
                    .msg("All Application history")
                    .bd(sts)
                    .build();
              return ResponseEntity.ok().body(response);
    }
}

