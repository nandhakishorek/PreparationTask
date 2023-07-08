package com.studentdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentdetails.dao.StudentDetailsDao;
import com.studentdetails.entity.Student;
import com.studentdetails.exception.AgeLimitException;

@Service
public class StudentDetailsService {
	@Autowired
	StudentDetailsDao sd;

	public String setStudentDetails(List<Student> s) throws AgeLimitException {
		for (Student x : s) {
			if (x.getAge() < 18) {
				throw new AgeLimitException();
			}
		}
		return sd.setStudentDetails(s);
	}

	public List<Integer> getAtndByRoll(int rollNo) {
		return sd.getAtndByRoll(rollNo);
	}

	public List<String> getNameByRoll(int rollNo) {
		return sd.getNameByRoll(rollNo);
	}

	public List<Student> getStudentDetails() {
		return sd.getStudentDetails();
	}

}
