package com.locum.users.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="locum_Vacancy_Info")
public class LocumVacancyInfo {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@NotNull
	private String userID;
	
	@NotNull
	private Date fromTime;
	
	@NotNull
	private Date fromDate;
	
	@NotNull
	private String duration;
	
	@NotNull
	private String hospitalName;
	
	@NotNull
	private String hosptialContactNumber;
	
	@NotNull
	private String hospitalAddress;
	
	@NotNull
	private String eligibility;
	
	@NotNull
	private String specialization;
	public long getID() {
		return id;
	}
	public void setID(long iD) {
		id = iD;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public Date getFromTime() {
		return fromTime;
	}
	public void setFromTime(Date fromTime) {
		this.fromTime = fromTime;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHosptialContactNumber() {
		return hosptialContactNumber;
	}
	public void setHosptialContactNumber(String hosptialContactNumber) {
		this.hosptialContactNumber = hosptialContactNumber;
	}
	public String getHospitalAddress() {
		return hospitalAddress;
	}
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
}
