package com.itp.ITPFirstSpringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.ITPFirstSpringboot.entity.Dept;
import com.itp.ITPFirstSpringboot.entity.State;
import com.itp.ITPFirstSpringboot.repository.DeptRepository;

@Service
public class DeptService {

	@Autowired
	DeptRepository deptRepository;

	public Dept addDept(Dept dept) {
		return deptRepository.save(dept);
	}

	public void deleteDept(int dno) {
		deptRepository.deleteById(dno);
	}
}
