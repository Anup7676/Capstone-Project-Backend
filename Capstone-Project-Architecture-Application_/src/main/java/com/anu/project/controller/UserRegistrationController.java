package com.anu.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anu.project.service.UserService;
import lombok.AllArgsConstructor;

@CrossOrigin
@AllArgsConstructor
@RequestMapping("/registration")
@RestController
public class UserRegistrationController {
    private UserService userService;

    
}
