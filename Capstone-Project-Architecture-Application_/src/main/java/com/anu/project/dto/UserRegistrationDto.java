package com.anu.project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class UserRegistrationDto {

    private String name;
    private String email;
    private String password;
    
}
