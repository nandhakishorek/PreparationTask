package com.studentdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentdetails.entity.Student;
import com.studentdetails.exception.AgeLimitException;
import com.studentdetails.service.StudentDetailsService;

@RestController
public class StudentDetailsController {
	@Autowired
	StudentDetailsService ss;

	@PostMapping(value = "/setStudentDetails")
	public String setStudentDetails(@RequestBody List<Student> s) throws AgeLimitException {
		return ss.setStudentDetails(s);
	}
	@GetMapping(value="/getStudentDetails")
	public List<Student> getStudentDetails() {
		return ss.getStudentDetails();
	}
	@GetMapping(value="/getAtndByRoll/{rollNo}")
	public List<Integer> getAtndByRoll(@PathVariable int rollNo) {
		return ss.getAtndByRoll(rollNo);
	}
	@GetMapping(value="/getNameByRoll/{rollNo}")
	public List<String> getNameByRoll(@PathVariable int rollNo) {
		return ss.getNameByRoll(rollNo);
	}
	

}
