package com.spring.security.service;

import java.util.List;
import com.spring.security.entity.Student;

public interface StudentService {
	
	public List<Student> findAll();

	public Student findById(int id);

	public void save(Student theStudent);

	public void deleteByid(int id);

}
