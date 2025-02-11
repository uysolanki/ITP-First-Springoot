package com.itp.ITPFirstSpringboot.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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
	public List<Student> getAllStudents() {
		return studentRepository.findAll();	
	}
	public Student getStudent(int rno) {
	return studentRepository.findById(rno).get();
	}
	public List<Student> getStudentByFirstName(String fname) {
		return studentRepository.findByFirstName(fname);
	}
	public List<Student> getStudentBornBefore(LocalDate bdate) {
		return studentRepository.findByDobBefore(bdate);
	}

}
