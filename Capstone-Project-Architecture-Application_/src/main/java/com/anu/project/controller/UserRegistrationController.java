package com.anu.project.controller;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anu.project.domain.User;
import com.anu.project.dto.AppResponse;
import com.anu.project.dto.UserRegistrationDto;
import com.anu.project.service.UserService;

import lombok.AllArgsConstructor;
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/signup")
@RestController
public class UserRegistrationController {

    private UserService userService;

    @CrossOrigin
    @PostMapping (value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> registerUser(@RequestBody UserRegistrationDto registrationDto) {
        User savedUser = userService.save(registrationDto);
        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                                                    .sts("success")
                                                    .msg("User Created Successfully")
                                                    .build();
        return ResponseEntity.ok(savedUser);
    }
}

