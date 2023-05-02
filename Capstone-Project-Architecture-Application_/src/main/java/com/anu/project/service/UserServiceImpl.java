package com.anu.project.service;

import java.util.Arrays;
import org.springframework.stereotype.Service;

import com.anu.project.domain.Role;
import com.anu.project.domain.User;
import com.anu.project.dto.UserRegistrationDto;
import com.anu.project.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user=new User(registrationDto.getName(), registrationDto.getEmail(), registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
      
    }
    
}
