package com.locum.users.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="userDetails")
public class UsersDetails {
	
	@Id
	private String userID;
	
	
	private String address;
	
	@NotNull
	private String contactNumberPrimary;
	
	private String contactNumberSecondary;
}
