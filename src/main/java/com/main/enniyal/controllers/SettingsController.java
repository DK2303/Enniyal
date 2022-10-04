package com.main.enniyal.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.main.enniyal.model.SettingsModel;
import com.main.enniyal.service.SettingsService;

@RestController
@RequestMapping("/api/v1/company")
public class SettingsController {

	
	@Autowired
	SettingsService settingsService;
	
	Logger logger = LoggerFactory.getLogger(SettingsController.class);
	
	@PostMapping("/add")
	public SettingsModel addSettingsInfo(@RequestPart("file") MultipartFile file, @RequestPart("request") String request) {
		System.out.println("Inside Controller");
		System.out.println(request);
		return settingsService.addSettingsInfo(file,request);
	}
	
	@GetMapping("/get/{companyName}")
	public SettingsModel getSettingsInfo(@PathVariable("companyName") String companyName) {
		logger.info("Get Settings INFO..!!!");
		System.out.println("Inside Controller====>"+companyName);
		return settingsService.getSettingsInfo(companyName);
	}
	
	@PutMapping("/put")
	public SettingsModel updateSettingsInfo(@RequestPart("file") MultipartFile file, @RequestPart("request") String request) {
		System.out.println("Inside Controller");
		System.out.println(request);
		return settingsService.updateSettingsInfo(file,request);
	}
}
