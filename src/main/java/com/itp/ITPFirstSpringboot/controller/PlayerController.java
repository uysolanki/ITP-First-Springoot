package com.itp.ITPFirstSpringboot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itp.ITPFirstSpringboot.entity.Player;
import com.itp.ITPFirstSpringboot.service.PlayerService;
import com.itp.ITPFirstSpringboot.util.ValidationErrorResponse;

@RestController
public class PlayerController {

	@Autowired
	PlayerService playerService;
	
	@PostMapping("/savePlayer")
	public ResponseEntity<?> savePlayer(@RequestBody @Valid Player p1, BindingResult bindingResult)
	{	
		 if (bindingResult.hasErrors()) 
			{
				 List<ValidationErrorResponse> errors = new ArrayList<>();
				 for (FieldError error : bindingResult.getFieldErrors()) 
				{
					 ValidationErrorResponse apiError = new ValidationErrorResponse(error.getDefaultMessage(), error.getField(), error.getRejectedValue());
			          errors.add(apiError);
			    }
				 return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
			 }
			return new ResponseEntity<>(playerService.savePlayer(p1),HttpStatus.CREATED);

	}
}
