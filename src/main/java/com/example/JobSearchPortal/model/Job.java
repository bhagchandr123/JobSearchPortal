package com.example.JobSearchPortal.model;

import com.example.JobSearchPortal.Enum.JobType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    String description;

    String location;

    Double salary;

    String companyEmail;

    String companyName;

    String employerName;

    @Enumerated(EnumType.STRING)
    JobType jobType;

    LocalDate appliedDate;



}
