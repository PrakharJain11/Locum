package com.locum.users.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.locum.users.validation.UniqueMobileNumber;

@Entity
@Table(name = "Users")
public class Users implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	/*
	 * @GeneratedValue( strategy= GenerationType.AUTO, generator="native" )
	 * 
	 * @GenericGenerator( name = "native", strategy = "native" )
	 */	public String ID;
	
	@NotNull
	public String name;
	
	
	@NotNull
	@Column(name = "contact_number", unique = true)
	@UniqueMobileNumber(message = "Number Already exist")
	@JsonIgnore
	public String contactNumber;
	
	@Column(name = "user_Type")
	@NotNull
	public String userType;
	
	@Column(name = "salary")
	public double salary;
	
	@Column(name = "doctor_degree")
	@NotNull
	public String doctorDegree;
	
	@Column(name = "doctor_specialization")
	@NotNull
	public String doctorSpecialization;
	
	/*@NotNull
	public String address;
	
	@NotNull
	public String city;
	
	@NotNull
	public String state;
	
	@NotNull
	public int PIN;
	
	@NotNull
	public String country;
*/	
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
		return userType;
	}
	public void setUser_Type(String user_Type) {
		this.userType = user_Type;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDoctor_Degree() {
		return doctorDegree;
	}
	public void setDoctor_Degree(String doctor_Degree) {
		this.doctorDegree = doctor_Degree;
	}
	public String getDoctor_Specialization() {
		return doctorSpecialization;
	}
	public void setDoctor_Specialization(String doctor_Specialization) {
		this.doctorSpecialization = doctor_Specialization;
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
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "contact_number", referencedColumnName = "contact_number")
	List<UsersAddress> userAddress = new ArrayList<>();

	public List<UsersAddress> getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(List<UsersAddress> userAddress) {
		this.userAddress = userAddress;
	} 
	
	
	 
}