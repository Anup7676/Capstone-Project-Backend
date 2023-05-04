package com.anu.project.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class LoginDto {

    @NotEmpty(message = "Username cant be empty")
    @NotNull(message = "Username cant be null")
    @NotBlank(message = "Username cant be blank")
    private String userName;
    
    @NotEmpty(message = "password cant be empty")
    @NotNull(message = "password cant be null")
    @NotBlank(message = "password cant be blank")
    private String password;
}