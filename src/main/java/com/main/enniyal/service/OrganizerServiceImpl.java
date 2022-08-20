package com.main.enniyal.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.enniyal.dao.CompanyDAO;
import com.main.enniyal.dao.OrganizerDAO;
import com.main.enniyal.dto.AddOrganizerAndCompanyDTO;
import com.main.enniyal.dto.CompanyDTO;
import com.main.enniyal.dto.OrganizerDTO;
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
	public ResponseDTO addOrganizer(AddOrganizerAndCompanyDTO addOrganizerAndCompanyDTO) throws Exception {
		ModelMapper mm = new ModelMapper();
		CompanyDTO companyDTO = addOrganizerAndCompanyDTO.getCompany();
		OrganizerDTO organizerDTO = addOrganizerAndCompanyDTO.getOrganizer();
		System.out.println(companyDTO.getEmail());
		validator.emailValidator(companyDTO.getEmail());
		System.out.println(companyDTO.getMobileNumber().toString());
		validator.isValidMobileNo(companyDTO.getMobileNumber().toString());
		System.out.println(organizerDTO.getMobileNumber().toString());
		validator.isValidMobileNo(organizerDTO.getMobileNumber().toString());
		try {
			CompanyModel companyModel = mm.map(companyDTO, CompanyModel.class);
			OrganizerModel organizerModel = mm.map(organizerDTO, OrganizerModel.class);
			CompanyModel company= companyDAO.addCompany(companyModel);
			organizerModel.setCompanyId(company);
			organizerDAO.addOrganizer(organizerModel);
			ResponseDTO response = new ResponseDTO("success", "user Created Successfully", "test");
			return response;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
