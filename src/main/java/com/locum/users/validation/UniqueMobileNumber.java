package com.locum.users.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD, METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueMobileNumberValidator.class)
public @interface UniqueMobileNumber {
	public String message() default "There is already user with this Mobile Number";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default{};
}
