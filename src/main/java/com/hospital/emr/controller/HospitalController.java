package com.hospital.emr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.emr.dto.PatientDTO;
import com.hospital.emr.service.PatientService;
import com.hospital.emr.manager.PatientManager;

@RestController
@RequestMapping (value="/rest/patient")
public class HospitalController {

	@Autowired
	PatientManager patientManager;
	
	@RequestMapping(value="/getAllPatients",method = RequestMethod.GET)
	public List<PatientDTO> getAllPatients(){
		return patientManager.getAllPatients();
		
	}
	
}
