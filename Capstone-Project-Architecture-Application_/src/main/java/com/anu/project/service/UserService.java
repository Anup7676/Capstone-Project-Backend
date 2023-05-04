package com.anu.project.service;

import com.anu.project.dto.CreateUserDto;
import com.anu.project.dto.LoginDto;
import com.anu.project.dto.UserDto;
import com.anu.project.exception.UserNotFoundException;

public interface UserService {
    Integer signup(CreateUserDto dto);

    UserDto login(LoginDto dto) throws UserNotFoundException;
}

