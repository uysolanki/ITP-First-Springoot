package com.itp.ITPFirstSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itp.ITPFirstSpringboot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
