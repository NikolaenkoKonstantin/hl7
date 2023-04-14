package com.example.hl7.task.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {
    private int idPatient;
    private long snils;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
}
