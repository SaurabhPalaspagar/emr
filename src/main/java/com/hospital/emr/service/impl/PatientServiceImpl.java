package com.hospital.emr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.emr.dto.PatientDTO;
import com.hospital.emr.manager.PatientManager;
import com.hospital.emr.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientManager patientManager;
	
	@Override
	public List<PatientDTO> getAllPatients() {
		return patientManager.getAllPatients();
	}

}
