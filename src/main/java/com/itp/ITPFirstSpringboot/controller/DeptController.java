package com.itp.ITPFirstSpringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itp.ITPFirstSpringboot.entity.Dept;
import com.itp.ITPFirstSpringboot.entity.State;
import com.itp.ITPFirstSpringboot.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	DeptService deptService;
	
	@PostMapping("/addDept")
	public Dept addState(@RequestBody Dept dept)
	{
		return deptService.addDept(dept);
	}
	
	
	@DeleteMapping("/deleteDept/{dno}")
	public String deleteDept(@PathVariable int dno)
	{
		deptService.deleteDept(dno);
		return "Record Deleted";
	}
}
