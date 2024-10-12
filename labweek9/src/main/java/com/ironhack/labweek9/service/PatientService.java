package com.ironhack.labweek9.service;

import com.ironhack.labweek9.model.Patient;
import com.ironhack.labweek9.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }
}
