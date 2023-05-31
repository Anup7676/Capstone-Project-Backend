package com.anu.project.dto;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPostingDto {

    @NotNull(message = "jobTitle cant be null")
    @NotBlank(message = "jobTitle cant be blank")
    private String jobTitle;

    @NotNull(message = "jobDescription cant be null")
    @NotBlank(message = "jobDescription cant be blank")
    private String jobDescription;

    @NotNull(message = "location cant be null")
    @NotBlank(message = "location cant be blank")
    private String location;

    @NotNull(message = "industry cant be null")
    @NotBlank(message = "industry cant be blank")
    private String industry;
   
    @NotNull(message = "qualification cant be null")
    @NotBlank(message = "qualification cant be blank")
    private String qualification;

    @NotNull(message = "applicationRequirement cant be null")
    @NotBlank(message = "applicationRequirement cant be blank")
    private String applicationRequirement;

    
    private LocalDate postedDate;
}
