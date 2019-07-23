package com.locum.users.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.locum.users.validation.UniqueMobileNumber;

@Entity
@Table(name = "Users")
public class Users {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	public String ID;
	@NotNull
	public String name;
	
	
	@NotNull
	@Column(unique = true)
	@UniqueMobileNumber(message = "Number Already exist")
	public String contactNumber;
	@NotNull
	public String user_Type;
	
	public double salary;
	
	@NotNull
	public String doctor_Degree;
	
	@NotNull
	public String doctor_Specialization;
	
	@NotNull
	public String address;
	
	@NotNull
	public String city;
	
	@NotNull
	public String state;
	
	@NotNull
	public int PIN;
	
	@NotNull
	public String country;
	
	@NotNull
	public String email;
	
	@NotNull
	public String password;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact_Number() {
		return contactNumber;
	}
	public void setContact_Number(String contact_Number) {
		this.contactNumber = contact_Number;
	}
	public String getUser_Type() {
		return user_Type;
	}
	public void setUser_Type(String user_Type) {
		this.user_Type = user_Type;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDoctor_Degree() {
		return doctor_Degree;
	}
	public void setDoctor_Degree(String doctor_Degree) {
		this.doctor_Degree = doctor_Degree;
	}
	public String getDoctor_Specialization() {
		return doctor_Specialization;
	}
	public void setDoctor_Specialization(String doctor_Specialization) {
		this.doctor_Specialization = doctor_Specialization;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	 
}
