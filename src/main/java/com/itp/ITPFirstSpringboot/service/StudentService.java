package com.itp.ITPFirstSpringboot.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.itp.ITPFirstSpringboot.entity.Student;
import com.itp.ITPFirstSpringboot.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	private static final Logger logger=Logger.getLogger(StudentRepository.class);
	
	public Student saveStudent(Student s1) {
		logger.info("Service method invoked to add Student " +s1.getFirstName());
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
	public List<Student> getStudentByPercentage(double percentage) {
		return studentRepository.findByPercentageGreaterThanEqual(percentage);
	}
	public List<Student> getStudentsByCompanyName(String companyName) {
		return studentRepository.findByEmailContaining(companyName);
	}
	public void deleteStudent(int rno) {
		studentRepository.deleteById(rno);	
	}
	public List<Student> saveAllStudents(List<Student> students) {
		return studentRepository.saveAll(students);
	}
	public Student updateStudent(int rno, Student newDetails) {
		Student studentFromDb=getStudent(rno);
//		if(newDetails.getEmail()!=null)
//		studentFromDb.setEmail(newDetails.getEmail());
//		
//		if((Integer)newDetails.getAge()!=null)
//		studentFromDb.setAge(newDetails.getAge());
//		
//		if(newDetails.getFirstName()!=null)
//		studentFromDb.setFirstName(newDetails.getFirstName());
//		
//		if(newDetails.getLastName()!=null)
//		studentFromDb.setLastName(newDetails.getLastName());
//		
		
		studentFromDb.setEmail(Objects.requireNonNullElse(newDetails.getEmail(),studentFromDb.getEmail()));
		studentFromDb.setAge(Objects.requireNonNullElse(newDetails.getAge(),0));
		studentFromDb.setFirstName(Objects.requireNonNullElse(newDetails.getFirstName(),studentFromDb.getFirstName()));
		studentFromDb.setLastName(Objects.requireNonNullElse(newDetails.getLastName(),studentFromDb.getLastName()));
		
		return saveStudent(studentFromDb);
	}
	public List<Student> getSortedStudent(String sortedFiled) {
		return studentRepository.findAll(Sort.by(
				Sort.Order.asc(sortedFiled),
				Sort.Order.asc("lastName")
				));	
		
	}
	public Page<Student> getStudentByPagination(int pageNumer, int pageSize) {
		return studentRepository.findAll(
				PageRequest.of(pageNumer, pageSize)
				);
				
	}
	public Page<Student> getStudentBySortingAndPagination(String sortedFiled, int pageNumer, int pageSize) {
		return studentRepository.findAll(
				PageRequest.of(pageNumer, pageSize)
				.withSort(Sort.by(Sort.Direction.ASC,sortedFiled))
				);
	}

}
