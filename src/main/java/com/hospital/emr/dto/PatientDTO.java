package com.hospital.emr.dto;

import java.util.Date;

public class PatientDTO {
	private int id;
    private String firstName;
    private String lastName;
    private Date DOB;
    private String gender;
 
    public PatientDTO() {
    }
 
    public PatientDTO(int id, String firstName,String lastName, Date DOB, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.gender=gender;
    }
 
    public long getId() {
        return id;
    }
 
    public String getfirstName() {
        return firstName;
    }
    
    public String getlastName() {
        return lastName;
    }
    
    public Date getDOB() {
    	return DOB;
    }
    
    public String getGender() {
    	return gender;
    }
    
    
    public void setId(int id) {
    	this.id=id;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public void setGender(String gender) {
        this.gender = gender;
    }
 
    @Override
    public String toString() {
        return "Patient{" +
                "Id=" + id +
                ", First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}
