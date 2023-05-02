package com.anu.project.service;

import com.anu.project.domain.User;
import com.anu.project.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
