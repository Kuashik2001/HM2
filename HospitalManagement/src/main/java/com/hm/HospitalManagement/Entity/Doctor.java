package com.hm.HospitalManagement.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "doctors")
public class Doctor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String specialization;
    
    @Column(nullable = false)
    private LocalDate dateOfJoining;
    
    @Column(nullable = false)
    private int experience;

    // Constructors
    public Doctor() {}

    public Doctor(String name, String specialization, LocalDate dateOfJoining, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.dateOfJoining = dateOfJoining;
        this.experience = experience;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public LocalDate getDateOfJoining() { return dateOfJoining; }
    public void setDateOfJoining(LocalDate dateOfJoining) { this.dateOfJoining = dateOfJoining; }

    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }
}
