package com.hospital.emr.mapper;

import org.springframework.stereotype.Component;
import com.hospital.emr.dto.PatientDTO;
import com.hospital.emr.model.Patient;


@Component
public class PatientMapper {
	
	public void getAllPatientsFromDTO(PatientDTO patientDTO, Patient patient) {
		
		patientDTO.setId(patient.getId());
		patientDTO.setFirstName(patient.getFirstName());
		patientDTO.setLastName(patient.getLastName());
		patientDTO.setDOB(patient.getDOB());
		patientDTO.setGender(patient.getGender());


	}
}
