package com.ironhack.labweek9.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientDTO {

    private String name;

    private LocalDate dateOfBirth;

    private Integer doctor;
}
