package com.main.enniyal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.enniyal.Projection.GetOrganizerProjection;
import com.main.enniyal.dto.AddOrganizeDTO;
import com.main.enniyal.dto.ResponseDTO;
import com.main.enniyal.service.OrganizerService;

@RestController
@RequestMapping("/api/v1")
public class OrganizerController {

	@Autowired
	OrganizerService organizerService;

	@PostMapping("add/organizer")
	public ResponseDTO addOrganizer(@RequestBody AddOrganizeDTO addOrganizeDTO) throws Exception {
		return organizerService.addOrganizer(addOrganizeDTO);
	}

	@GetMapping("get/organizer")
	public List<GetOrganizerProjection> getOrganizer(@RequestParam(required = false, name = "companyId") Long companyId,
			@RequestParam(required = false, name = "organizerId") Long organizerId) {
		return organizerService.getOrganizer(companyId, organizerId);
	}

}
