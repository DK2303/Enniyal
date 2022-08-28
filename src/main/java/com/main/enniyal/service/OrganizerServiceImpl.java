package com.main.enniyal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.enniyal.Projection.GetOrganizerProjection;
import com.main.enniyal.dao.CompanyDAO;
import com.main.enniyal.dao.OrganizerDAO;
import com.main.enniyal.dto.AddOrganizeDTO;
import com.main.enniyal.dto.ResponseDTO;
import com.main.enniyal.model.CompanyModel;
import com.main.enniyal.model.OrganizerModel;
import com.main.enniyal.util.Validator;

@Service
public class OrganizerServiceImpl implements OrganizerService {

	@Autowired
	CompanyDAO companyDAO;

	@Autowired
	OrganizerDAO organizerDAO;

	@Autowired
	Validator validator;

	@Override
	@Transactional
	public ResponseDTO addOrganizer(AddOrganizeDTO addOrganizeDTO) throws Exception {
		
		validator.emailValidator(addOrganizeDTO.getEmailId());
		validator.isValidMobileNo(addOrganizeDTO.getContactNumber().toString());
		try {
			CompanyModel companyModel = new CompanyModel(addOrganizeDTO.getCompanyName(),
														 addOrganizeDTO.getContactNumber(),
														 addOrganizeDTO.getEmailId(),
														 addOrganizeDTO.getPlan(),
														 addOrganizeDTO.getPayment(),
														 addOrganizeDTO.getPaymentMethod(),
														 addOrganizeDTO.getPaymentMode());
			CompanyModel company= companyDAO.addCompany(companyModel);
			OrganizerModel organizerModel = new OrganizerModel(addOrganizeDTO.getName(),
					                                           addOrganizeDTO.getCompanyName(),
					 										   addOrganizeDTO.getContactNumber(),
					 										   addOrganizeDTO.getPlan(),
					                                           addOrganizeDTO.getPayment());
			organizerModel.setCompanyId(company);
			organizerDAO.addOrganizer(organizerModel);
			ResponseDTO response = new ResponseDTO("success", "user Created Successfully", "test");
			return response;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<GetOrganizerProjection> getOrganizer(Long companyId, Long organizerId) {
		if (companyId != null && organizerId == null) {
			return companyDAO.getCompany(companyId);
		} else if (organizerId != null && companyId == null) {
			return companyDAO.getOrganizer(organizerId);	
		}else {
			return companyDAO.getAllCompany();
		}
	}
}
