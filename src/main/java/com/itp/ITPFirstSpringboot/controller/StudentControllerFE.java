package com.itp.ITPFirstSpringboot.controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itp.ITPFirstSpringboot.entity.Student;
import com.itp.ITPFirstSpringboot.service.StudentService;

@Controller
public class StudentControllerFE {

	@Autowired
	StudentService studentService;
	
	private static final Logger logger=Logger.getLogger(StudentControllerFE.class);
	
	@RequestMapping("/greetui")
	public String greet()
	{
		return "welcome";
	}
	
	@RequestMapping("/")
	public String homepage(Model model)
	{
		List<Student> students=studentService.getAllStudents();
		model.addAttribute("students",students);
		return "studentlist";
	}
	
	@RequestMapping("/registerRegister")
	public String registerRegister(Model model)
	{
		Student s=new Student();
		model.addAttribute("student",s);
		return "register-student-form";
	}
	
	
	@PostMapping("/saveStudent")
	public String saveStudentUsingRequestBody(@ModelAttribute Student s1)
	{		
		  logger.info("Request Received to Add Student " +s1.getFirstName());
		  long st=System.currentTimeMillis();
			try {
				LocalDate today=LocalDate.now();
				LocalDate dob1=s1.getDob();
				
				Period period = Period.between(dob1, today);
		        int age = period.getYears(); 
		 
				logger.info(age);
				s1.setAge(age);
				Student student=studentService.saveStudent(s1);
				long et=System.currentTimeMillis();
				logger.info("Student Added " +s1.getFirstName());
				logger.info("Time taken to add Student " +(et-st) + " millisecs");
				return "redirect:/";
				
			} catch (Exception e) {
				logger.warn("Unable to Add Student " +s1.getFirstName() + e.getLocalizedMessage());
				return "myerrors";
			}	
	}
	
	@RequestMapping("/deleteStudentFE/{rno}")
	public String deleteStudent(@PathVariable int rno)
	{
		studentService.deleteStudent(rno);
		return "redirect:/";
	}
	
	@RequestMapping("/updateStudentForm/{rno}")
	public String updateStudentForm(@PathVariable int rno,Model model)
	{
		Student student=studentService.getStudent(rno);
		model.addAttribute("student",student);
		return "update-student-form";
	}
	
	@PostMapping("/updateStudentFE/{rno}") //updateStudent/1
	public String updateStudent(@ModelAttribute Student newDetails,@PathVariable int rno)
	{
		try
		{
		studentService.updateStudent(rno,newDetails);
		return "redirect:/";
		}
		catch(Exception e)
		{
		return "myerrors";
		}
	}
}
