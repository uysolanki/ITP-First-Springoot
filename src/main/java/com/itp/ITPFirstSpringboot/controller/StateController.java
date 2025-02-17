package com.itp.ITPFirstSpringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itp.ITPFirstSpringboot.entity.State;
import com.itp.ITPFirstSpringboot.service.StateService;

@RestController
public class StateController {

	@Autowired
	StateService stateService;
	
	@PostMapping("/addState")
	public State addState(@RequestBody State state)
	{
		return stateService.addState(state);
	}
}
