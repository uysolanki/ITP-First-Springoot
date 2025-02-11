package com.itp.ITPFirstSpringboot.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itp.ITPFirstSpringboot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{
		public List<Student> findByFirstName(String s);
		
		public List<Student> findByDobBefore(LocalDate d);
}
