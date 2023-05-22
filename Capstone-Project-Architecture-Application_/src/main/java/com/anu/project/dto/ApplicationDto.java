package com.anu.project.dto;

import java.time.LocalDate;
    
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ApplicationDto {
    
        private Long id;
    
        @NotEmpty(message = "jobTitle cant be empty")
        @NotNull(message = "jobTitle cant be null")
        @NotBlank(message = "jobTitle cant be blank")
        private String jobTitle;
    
        @NotEmpty(message = "jobDescription cant be empty")
        @NotNull(message = "jobDescription cant be null")
        @NotBlank(message = "jobDescription cant be blank")
        private String jobDescription;
    
        @NotEmpty(message = "location cant be empty")
        @NotNull(message = "location cant be null")
        @NotBlank(message = "location cant be blank")
        private String location;
    
        @NotEmpty(message = "industry cant be empty")
        @NotNull(message = "industry cant be null")
        @NotBlank(message = "industry cant be blank")
        private String industry;
    
        @NotEmpty(message = "qualification cant be empty")
        @NotNull(message = "qualification cant be null")
        @NotBlank(message = "qualification cant be blank")
        private String qualification;
    
        @NotEmpty(message = "applicationRequirement cant be empty")
        @NotNull(message = "applicationRequirement cant be null")
        @NotBlank(message = "applicationRequirement cant be blank")
        private String applicationRequirement;
        
        @NotEmpty(message = "postedDate cant be empty")
        @NotNull(message = "postedDate cant be null")
        @NotBlank(message = "postedDate cant be blank")
        private LocalDate postedDate;
    }
