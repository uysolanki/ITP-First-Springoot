package com.itp.ITPFirstSpringboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itp.ITPFirstSpringboot.entity.Student;
import com.itp.ITPFirstSpringboot.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

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
	@PostMapping("/saveHardCodedStudent")
	public Student saveHardCodedStudent()
	{
		Student s1=new Student();
		s1.setAge(21);
		s1.setEmail("alice@gmail.com");
		s1.setFirstName("Alice");
		s1.setGender("female");
		s1.setLastName("Fernandes");
		s1.setPercentage(78.5);
		
		return studentService.saveStudent(s1);
	}
	
	
	@PostMapping("/saveStudentUsingRequestParam")
	public Student saveStudentUsingRequestParam(
			@RequestParam("a") int studAge,
			@RequestParam("b") String studEmail,
			@RequestParam("c") String studFname,
			@RequestParam("d") String studGender,
			@RequestParam("e") String studLname,
			@RequestParam("f") double studPer)
	{
		Student s1=new Student();
		s1.setAge(studAge);
		s1.setEmail(studEmail);
		s1.setFirstName(studFname);
		s1.setGender(studGender);
		s1.setLastName(studLname);
		s1.setPercentage(studPer);
		
		return studentService.saveStudent(s1);
	}
	
	
	@PostMapping("/saveStudentUsingPathVariable/{sage}/{b}/{c}/{d}/{e}/{f}")
	public Student saveStudentUsingPathVariable(
			@PathVariable("sage") int studAge,
			@PathVariable("b") String studEmail,
			@PathVariable("c") String studFname,
			@PathVariable("d") String studGender,
			@PathVariable("e") String studLname,
			@PathVariable("f") double studPer)
	{
		Student s1=new Student();
		s1.setAge(studAge);
		s1.setEmail(studEmail);
		s1.setFirstName(studFname);
		s1.setGender(studGender);
		s1.setLastName(studLname);
		s1.setPercentage(studPer);
		
		return studentService.saveStudent(s1);
	}
	
	@PostMapping("/saveStudentUsingPathVariable2/{studAge}/{studEmail}/{studFname}/{studGender}/{studLname}/{studPer}")
	public Student saveStudentUsingPathVariable2(
			@PathVariable int studAge,
			@PathVariable String studEmail,
			@PathVariable String studFname,
			@PathVariable String studGender,
			@PathVariable String studLname,
			@PathVariable double studPer)
	{
		Student s1=new Student();
		s1.setAge(studAge);
		s1.setEmail(studEmail);
		s1.setFirstName(studFname);
		s1.setGender(studGender);
		s1.setLastName(studLname);
		s1.setPercentage(studPer);
		
		return studentService.saveStudent(s1);
	}
	
	@PostMapping("/saveStudentUsingRequestBody")
	public Student saveStudentUsingRequestBody(@RequestBody Student s1)
	{		
		return studentService.saveStudent(s1);
	}
}



/*
{
"rno": 10,
"firstName": "Jerry",
"lastName": "Smith",
"age": 19,
"percentage": 81.9,
"gender": "male",
"email": "jerry@gmail.com"
}
*/