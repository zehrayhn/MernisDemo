package Entities;

//import java.sql.Date;
//import java.security.spec.ECField;
//import java.sql.Date;
//import java.time.LocalDate;
//import java.time.LocalDate;
//import java.time.LocalDate;

//import javax.print.attribute.standard.DateTimeAtCompleted;

import Abstract.Entity;

public class Customer implements Entity {
	private int id;
	private String firtsName;

	private String lastName;
	private String dateOfBirth;
	private String nationalityId;
	
	public Customer(int id, String firtsName, String lastName, String dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.dateOfBirth=dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	



	
}
