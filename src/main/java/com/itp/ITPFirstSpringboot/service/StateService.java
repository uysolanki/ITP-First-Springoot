package com.itp.ITPFirstSpringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.ITPFirstSpringboot.entity.State;
import com.itp.ITPFirstSpringboot.repository.StateRepository;

@Service
public class StateService {
	@Autowired
	StateRepository stateRepository;

	public State addState(State state) {
		return stateRepository.save(state);
	}
}
