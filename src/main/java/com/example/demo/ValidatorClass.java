package com.example.demo;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.demo.model.Users;

public class ValidatorClass implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Users.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Users user=(Users)obj;
		if(user.getUserName().length()<=4) {
			errors.rejectValue("name", "user.name", "The name is too short");
		}
		
	}

}
