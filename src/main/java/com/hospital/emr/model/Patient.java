package com.hospital.emr.model;
import java.util.Date;

import javax.persistence.*;

@Entity	
@Table(name = "patient")
public class Patient {	
	
	@Id
	@Column(name = "id")
	private int id;
	
	//@Column(name = "firstName")
	private String firstName;
	
	//@Column(name = "lastName")
    private String lastName;
	
	//@Column(name = "DOB")
    private Date DOB;
	
	//@Column(name = "gender")
    private String gender;
	
	   public int getId() {
	        return id;
	    }
	 
	    public String getFirstName() {
	        return firstName;
	    }
	    
	    public String getLastName() {
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
	
}
