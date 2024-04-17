package org.example.lab6.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.lab6.entity.Dentist;
import org.example.lab6.entity.Patient;
import org.example.lab6.entity.Surgery;

import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime appointmentDateTime;
    @ManyToOne()
    private Dentist dentist;
    @ManyToOne()
    private Patient patient;
    @ManyToOne()
    private Surgery surgery;


}
