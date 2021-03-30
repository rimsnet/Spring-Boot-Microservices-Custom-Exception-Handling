package com.rimsan.springboot.exception.handling.validationUtil;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.rimsan.springboot.exception.handling.error.CustomException;

@Component
public class EmployeeRequestValidationUtil {

	public void validateEmployeeId(long id)throws CustomException {
		if(id <= 0) {
			 throw new CustomException("Employee Id Should be positive number", HttpStatus.BAD_REQUEST); 
		 }
	}
	
}
