package com.itp.ITPFirstSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itp.ITPFirstSpringboot.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>
{

}
