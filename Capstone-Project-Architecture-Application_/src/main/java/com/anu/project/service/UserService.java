package com.anu.project.service;

import java.util.List;

import com.anu.project.dto.ApplicationDto;
import com.anu.project.dto.CreateUserDto;
import com.anu.project.dto.LoginDto;
import com.anu.project.dto.UserDto;
import com.anu.project.exception.UserNotFoundException;

public interface UserService {
    
    Integer signup(CreateUserDto dto);

    UserDto login(LoginDto dto) throws UserNotFoundException;

    Integer createJobApplication(Long userId, Long jobPostingId);

    List <ApplicationDto> getAllApplicattions(Long userId);

    List<ApplicationDto> getApplicationHistory(Long userId);
}

