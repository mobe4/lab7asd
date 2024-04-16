package org.example.lab6.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.lab6.dto.AppointmentDTO;
import org.example.lab6.dto.DentistDTO;

@Entity
@NoArgsConstructor
@Data
public class Appointment {

    @Id
    @GeneratedValue()
    private Long id;
    private LocalDateTime appointmentDateTime;
    @ManyToOne()
    private Dentist dentist;
    @ManyToOne()
    private Patient patient;
    @ManyToOne()
    private Surgery surgery;


}
