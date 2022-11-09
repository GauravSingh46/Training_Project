package com.example.HealthProject.controller;

import com.example.HealthProject.models.Doctor;
import com.example.HealthProject.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3002")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public List<Doctor> getDoctors()
    {
        return this.doctorService.getDoctors();
    }

    @GetMapping("/doctorsBySearch")
    public List<Doctor> getDoctorsBySearch(@RequestParam("query") String query)
    {
        return this.doctorService.getDoctorsBySearch(query);
    }


}
