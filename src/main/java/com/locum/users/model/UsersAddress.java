package com.locum.users.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Table(name="user_address")
@Entity
public class UsersAddress implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="system-uuid1")
	@GenericGenerator(name="system-uuid1", strategy = "uuid")
	public String Id;
	
	@NotNull
	public String addLine1;
	
	public String addLine2;
	
	@NotNull
	public String city;
	
	@Column(name = "contact_number")
	@NotNull
	public String contactNumber;
	
	@NotNull
	public String area;
	
	@NotNull
	public int PIN;
	
	@NotNull
	public String state;
	
	@NotNull
	public String country;
	
	
	//@ManyToOne(fetch = FetchType.LAZY, optional=false)
	//@JoinColumn(name = "contactNumber", nullable = false)
	//private Users user;
	
	/*public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}*/

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddLine2() {
		return addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUsersContacntNumber() {
		return contactNumber;
	}

	public void setUsersContacntNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/*public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}*/


}
