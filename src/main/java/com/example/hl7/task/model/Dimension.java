package com.example.hl7.task.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dimension")
public class Dimension {
    @Id
    @Column(name = "id_dimension")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDimension;

    @ManyToOne
    @JoinColumn(name = "id_patient", referencedColumnName = "id")
    private Patient owner;

    @Column(name = "ecg")
    private int ecg;

    @Column(name = "pulse")
    private int pulse;

    @Column(name = "breathing_rate")
    private int breathingRate;

    @Column(name = "niad")
    private int niad;

    @Column(name = "indicator_1")
    private int indicator1;

    @Column(name = "indicator_2")
    private int indicator2;

    @Column(name = "indicator_3")
    private int indicator3;

    @Column(name = "indicator_4")
    private int indicator4;
}
