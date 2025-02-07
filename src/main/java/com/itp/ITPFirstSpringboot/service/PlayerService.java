package com.itp.ITPFirstSpringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.ITPFirstSpringboot.entity.Player;
import com.itp.ITPFirstSpringboot.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	PlayerRepository playerRepository;
	public Player savePlayer(Player p1) {
		return playerRepository.save(p1);
	}

}
