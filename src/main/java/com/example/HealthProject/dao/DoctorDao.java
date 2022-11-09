package com.example.HealthProject.dao;

import com.example.HealthProject.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorDao extends JpaRepository<Doctor,Long> {


    @Query(value="SELECT * FROM doctor WHERE doctor.name LIKE CONCAT('%',:query, '%')",nativeQuery = true)
    List<Doctor> doctorBySearch(String query);
}
