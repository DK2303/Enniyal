package com.main.enniyal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.enniyal.dto.SettingsDTO;
import com.main.enniyal.service.SettingsService;

@RestController
@RequestMapping("/api/v1/company")
public class SettingsController {

	
	@Autowired
	SettingsService settingsService;
	
	@GetMapping("/get/{companyName}")
	public void getCompanyinfo(@PathVariable("companyName") String companyName) {
		System.out.println(companyName);
	}
	
	@PostMapping("/add")
	public String addCompnayInfo(@RequestBody SettingsDTO settingsDTO) {
		System.out.println("Test");
		System.out.println(settingsDTO);
		//settingsService.addCompanyInfo(request);
		return "DATA UPLOADED";
	}
}
