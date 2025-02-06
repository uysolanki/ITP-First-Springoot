package com.itp.ITPFirstSpringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.ITPFirstSpringboot.entity.Student;
import com.itp.ITPFirstSpringboot.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	public Student saveStudent(Student s1) {
		return studentRepository.save(s1);
		
	}

}
