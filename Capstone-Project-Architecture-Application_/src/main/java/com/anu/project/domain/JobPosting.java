package com.anu.project.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "job_postings")
public class JobPosting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "job_title", nullable = false)
    private String jobTitle;

    @Column(name = "job_description", nullable = false)
    private String jobDescription;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "industry", nullable = false)
    private String industry;

    @Column(name = "qualification", nullable = false)
    private String qualification;

    @Column(name = "application_requirement", nullable = false)
    private String applicationRequirement;

    @Column(name = "posted_date", nullable = false)
    private LocalDate postedDate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
                name="job_application",
                joinColumns=@JoinColumn(name="job_posting_id"),
                inverseJoinColumns = @JoinColumn(name="user_id")
    )
    private List<User> users=new ArrayList<>();
   
}
