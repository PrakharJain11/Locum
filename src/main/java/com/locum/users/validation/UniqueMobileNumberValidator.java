package com.locum.users.validation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.locum.users.repository.UsersRepository;


public class UniqueMobileNumberValidator implements ConstraintValidator<UniqueMobileNumber, String> {

		
	@Autowired
	private UsersRepository userRepository;
	
	public UniqueMobileNumberValidator()
	{}
	
	public UniqueMobileNumberValidator(UsersRepository userRepository) {
		// TODO Auto-generated constructor stub
		this.userRepository = userRepository;
	}
	
	@Override
	public void initialize(UniqueMobileNumber constraintAnnotation) {
	}
	
	@Override
	public boolean isValid(String value,ConstraintValidatorContext context)
	{
		System.out.println("In Validator");
		//System.out.println("userRepository.findByContactNumber(value)------->"+userRepository.findByContactNumber(value));
		if(userRepository == null) {
			System.out.println("In Null Condition");
			return true;
		}
		System.out.println("OutsideNull");
		return userRepository.findByContactNumber(value) == null;
	}
	
}
