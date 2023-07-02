package com.example.universityeventmanagement.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @NotBlank
    @Size(min = 1)
    @Pattern(regexp = "[A-Z].*")
    private String firstName;

    @NotBlank
    @Size(min = 1)
    private String lastName;

    @Min(18)
    @Max(25)
    private int age;

    @Enumerated(EnumType.STRING)
    private Department department;

    // constructors, getters, and setters
}

