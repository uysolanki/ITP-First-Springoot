package com.itp.ITPFirstSpringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itp.ITPFirstSpringboot.service.StudentService;

@Controller
public class StudentControllerFE {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/greetui")
	public String greet()
	{
		return "welcome";
	}
}
