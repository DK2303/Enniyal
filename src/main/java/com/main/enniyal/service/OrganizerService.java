package com.main.enniyal.service;

import java.util.List;

import com.main.enniyal.Projection.GetOrganizerProjection;
import com.main.enniyal.dto.AddOrganizeDTO;
import com.main.enniyal.dto.ResponseDTO;

public interface OrganizerService {

	public ResponseDTO addOrganizer(AddOrganizeDTO addOrganizeDTO) throws Exception;

	public List<GetOrganizerProjection> getOrganizer(Long companyId, Long organizerId);

}
