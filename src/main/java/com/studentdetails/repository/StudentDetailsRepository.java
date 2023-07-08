package com.studentdetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentdetails.entity.Student;

public interface StudentDetailsRepository extends JpaRepository<Student, Integer>{

	@Query(value = "select attendance from student where roll_number = ? ", nativeQuery = true)
	public List<Integer> getAtndByRoll(int rollNo);

	@Query(value = "select name from student where roll_number = ? ", nativeQuery = true)
	public List<String> getNameByRoll(int rollNo);

}