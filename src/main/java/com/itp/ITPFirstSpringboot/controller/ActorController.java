package com.itp.ITPFirstSpringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itp.ITPFirstSpringboot.entity.Actor;
import com.itp.ITPFirstSpringboot.service.ActorService;

@RestController
public class ActorController {

	@Autowired
	ActorService actorService;
	
	@PostMapping("/addActor")
	public Actor addActor(@RequestBody Actor actor)
	{
		return actorService.addActor(actor);
	}
}
