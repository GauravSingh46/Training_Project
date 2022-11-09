package com.example.HealthProject.service;

import com.example.HealthProject.models.Doctor;

import java.util.List;

public interface DoctorService {
    public List<Doctor> getDoctors();
    public List<Doctor> getDoctorsBySearch(String query);
}
