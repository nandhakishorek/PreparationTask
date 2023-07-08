package com.studentdetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class StudentException {
	@ExceptionHandler(AgeLimitException.class)
	public ResponseEntity<Object> AgeLimitFound() {
		return new ResponseEntity<>("Atleast 18 age required", HttpStatus.NOT_FOUND);
	}

}
