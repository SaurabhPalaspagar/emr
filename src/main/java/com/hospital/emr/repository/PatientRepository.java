package com.hospital.emr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.emr.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	List<Patient> findAll();
}
