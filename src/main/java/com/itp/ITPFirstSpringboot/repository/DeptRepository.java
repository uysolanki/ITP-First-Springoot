package com.itp.ITPFirstSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itp.ITPFirstSpringboot.entity.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer>
{

}
