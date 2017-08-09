package com.hospital.emr.manager;
import org.springframework.stereotype.Component;

import com.hospital.emr.dto.PatientDTO;
import com.hospital.emr.model.Patient;
import com.hospital.emr.repository.PatientRepository;
import com.hospital.emr.mapper.PatientMapper;

import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.ArrayList;
import java.util.List;

@Component
public class PatientManager {
	
	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	private PatientMapper mapper;
	
	public static List<Patient> patientDTOs;
	
	public List<PatientDTO> getAllPatients(){
		
		List<Patient> allpatients = patientRepository.findAll();
		List<PatientDTO> patientDTOs = null;
		
		if (allpatients != null && !allpatients.isEmpty()) {
			
			patientDTOs = new ArrayList<PatientDTO>();
			for (Patient user : allpatients) {
				PatientDTO userDTO = new PatientDTO();
				mapper.getAllPatientsFromDTO(userDTO, user);
				patientDTOs.add(userDTO);	
			}
	}
		return patientDTOs;

	}
	
	
}
