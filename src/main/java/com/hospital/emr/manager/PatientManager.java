package com.hospital.emr.manager;
import org.springframework.stereotype.Component;

import com.hospital.emr.dto.PatientDTO;

import java.util.ArrayList;
import java.util.List;

@Component
public class PatientManager {
	
	public static List<PatientDTO> patient;
	
	public List<PatientDTO> getAllPatients(){
		patient=new ArrayList<PatientDTO>();
		 
		PatientDTO one=new PatientDTO(1,"Saurabh","Palaspagar",null,"male");
	      patient.add(one);
		return patient;

	}
}
