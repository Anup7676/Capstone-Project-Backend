package com.anu.project.service;

import com.anu.project.dto.LoginDto;
import com.anu.project.dto.LoginResponseDto;
import com.anu.project.dto.RegisterDto;

public interface LoginService {
    
    Integer registerUser(RegisterDto dto);

    String loginUser(LoginDto dto);

    LoginResponseDto loginUserForResponse(LoginDto dto);
}
