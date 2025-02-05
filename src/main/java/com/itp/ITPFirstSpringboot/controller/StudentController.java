package com.itp.ITPFirstSpringboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itp.ITPFirstSpringboot.entity.Student;

@RestController
public class StudentController {

	@RequestMapping("/welcome")
	public String welcome()
	{
		return "Welcome to ITP";
	}
	
	@RequestMapping("/getStudent")
	public Student getStudent()
	{
		Student s1=new Student();
		s1.setAge(21);
		s1.setEmail("alice@gmail.com");
		s1.setFirstName("Alice");
		s1.setGender("female");
		s1.setLastName("Fernandes");
		s1.setPercentage(78.5);
		s1.setRno(101);
		
		return s1;
	}
	
	
	@RequestMapping("/getStudentList")
	public List<Student> getStudentList()
	{
		Student s1=new Student();
		s1.setAge(21);
		s1.setEmail("alice@gmail.com");
		s1.setFirstName("Alice");
		s1.setGender("female");
		s1.setLastName("Fernandes");
		s1.setPercentage(78.5);
		s1.setRno(101);
		
		Student s3=new Student();
		s3.setAge(23);
		s3.setEmail("chris@gmail.com");
		s3.setFirstName("Chris");
		s3.setGender("male");
		s3.setLastName("John");
		s3.setPercentage(98.5);
		s3.setRno(103);
		
		Student s2=new Student();
		s2.setAge(22);
		s2.setEmail("ben@gmail.com");
		s2.setFirstName("Ben");
		s2.setGender("male");
		s2.setLastName("Smith");
		s2.setPercentage(88.5);
		s2.setRno(102);
		
		
		ArrayList<Student> students=new ArrayList();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		return students;
		
		
	}
}
