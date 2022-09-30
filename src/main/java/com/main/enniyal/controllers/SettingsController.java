package com.main.enniyal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.enniyal.dto.SettingsDTO;
import com.main.enniyal.model.SettingsModel;
import com.main.enniyal.service.SettingsService;

@RestController
@RequestMapping("/api/v1/company")
public class SettingsController {

	
	@Autowired
	SettingsService settingsService;
	
	@GetMapping("/get/{companyName}")
	public SettingsModel getCompanyinfo(@PathVariable("companyName") String companyName) {
		System.out.println(companyName);
		return settingsService.getCompanyInfo(companyName);
	}
	
	@PostMapping("/add")
	public SettingsModel addCompnayInfo(@RequestBody SettingsDTO request) {
		System.out.println("Test");
		//System.out.println(request);
		return settingsService.addCompanyInfo(request);
		//return "DATA UPLOADED";
	}
	@PostMapping("/put")
	public SettingsModel editCompnayInfo(@RequestBody SettingsDTO request) {
		System.out.println("Test");
		//System.out.println(request);
		return settingsService.editCompanyInfo(request);
		//return "DATA UPLOADED";
	}
}
