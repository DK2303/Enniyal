package com.main.enniyal.service;

import com.main.enniyal.dto.AddOrganizerAndCompanyDTO;
import com.main.enniyal.dto.ResponseDTO;

public interface OrganizerService {

	public ResponseDTO addOrganizer(AddOrganizerAndCompanyDTO addOrganizerAndCompanyDTO) throws Exception;

}
