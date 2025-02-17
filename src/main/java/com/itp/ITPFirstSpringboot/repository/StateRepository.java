package com.itp.ITPFirstSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itp.ITPFirstSpringboot.entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>
{

}
