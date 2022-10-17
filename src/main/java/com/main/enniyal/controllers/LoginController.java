package com.main.enniyal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.enniyal.dto.LoginDTO;
import com.main.enniyal.service.LoginService;

@RestController
@RequestMapping("/api/v1")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/login")
	public boolean login(@RequestBody LoginDTO loginDTO) throws Exception {
		return loginService.login(loginDTO);
	}
	
}
