package com.example.HealthProject.service;

import com.example.HealthProject.dao.DoctorDao;
import com.example.HealthProject.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorDao doctorDao;

    @Override
    public List<Doctor> getDoctors() {
        return doctorDao.findAll();
    }

    @Override
    public List<Doctor> getDoctorsBySearch(String query) {
        List<Doctor> doctors=  doctorDao.doctorBySearch(query);
        return doctors;
    }
}
