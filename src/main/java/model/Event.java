package com.example.universityeventmanagement.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    @NotBlank
    @Size(min = 1)
    private String eventName;

    @NotBlank
    @Size(min = 1)
    private String locationOfEvent;

    @NotNull
    private LocalDate date;

    @NotNull
    private LocalTime startTime;

    @NotNull
    private LocalTime endTime;

    // constructors, getters, and setters
}

