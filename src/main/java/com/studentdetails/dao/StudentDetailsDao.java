package com.studentdetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentdetails.entity.Student;
import com.studentdetails.repository.StudentDetailsRepository;

@Repository
public class StudentDetailsDao {
	@Autowired
	StudentDetailsRepository sr;

	public String setStudentDetails(List<Student> s) {
		sr.saveAll(s);
		return "Saved Successfully";
	}

	public List<Integer> getAtndByRoll(int rollNo) {
		return sr.getAtndByRoll(rollNo);
	}

	public List<String> getNameByRoll(int rollNo) {
		return sr.getNameByRoll(rollNo);
	}

	public List<Student> getStudentDetails() {
		return sr.findAll();
	}

}
