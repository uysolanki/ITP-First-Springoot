package com.itp.ITPFirstSpringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.ITPFirstSpringboot.entity.Actor;
import com.itp.ITPFirstSpringboot.repository.ActorRepository;

@Service
public class ActorService {
	@Autowired
	ActorRepository actorRepository;
	
	public Actor addActor(Actor actor) {
		return actorRepository.save(actor);
	}

}
