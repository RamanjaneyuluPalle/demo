package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Register;
import com.example.repository.RegisterRepo;

@RestController
@RequestMapping("/register")
public class RegisterController {

	
	@Autowired
	private RegisterRepo repo;
	
	@PostMapping("/add")
	public Register add(@RequestBody Register model) {
		
		Register save = repo.save(model);
		
		return save;
	}
}
