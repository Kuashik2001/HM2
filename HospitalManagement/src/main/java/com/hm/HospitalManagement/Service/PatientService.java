package com.hm.HospitalManagement.Service;

import com.hm.HospitalManagement.Entity.Patient;
import com.hm.HospitalManagement.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    // Register a new patient
    public void registerPatient(Patient patient) {
        patientRepository.save(patient);
    }

    // Validate Patient Login
    public Patient validatePatient(String email, String password) {
        Patient patient = patientRepository.findByEmail(email);
        if (patient != null && patient.getPassword().equals(password)) {
            return patient;  // Login Successful
        }
        return null;  // Login Failed
    }
}

