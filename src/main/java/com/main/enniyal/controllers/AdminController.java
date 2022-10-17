package com.main.enniyal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.enniyal.dto.AdminDTO;
import com.main.enniyal.dto.ResponseDTO;
import com.main.enniyal.service.AdminService;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/add")
	public ResponseDTO login(@RequestBody AdminDTO adminDTO) throws Exception {
		return adminService.addAdminInfo(adminDTO);
	}
}
