package com.itp.ITPFirstSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itp.ITPFirstSpringboot.entity.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer>
{

}
