package com.main.enniyal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.enniyal.dto.AddOrganizerAndCompanyDTO;
import com.main.enniyal.dto.ResponseDTO;
import com.main.enniyal.model.CompanyModel;
import com.main.enniyal.service.OrganizerService;

@RestController
@RequestMapping("/api/v1")
public class OrganizerController {
	
	@Autowired
	OrganizerService organizerService;
	
	@PostMapping("add/Organizer")
	public ResponseDTO addOrganizer(@RequestBody AddOrganizerAndCompanyDTO addOrganizerAndCompanyDTO) throws Exception {
		return organizerService.addOrganizer(addOrganizerAndCompanyDTO);
	}

}
