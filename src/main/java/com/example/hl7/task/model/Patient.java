package com.example.hl7.task.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPatient;

    @OneToMany(mappedBy = "owner")
    private List<Dimension> dimensions;

    @Column(name = "snils")
    private long snils;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
}
