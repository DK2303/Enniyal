package com.main.enniyal.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.enniyal.dao.VendorDAO;
import com.main.enniyal.dto.VendorDTO;
import com.main.enniyal.model.CompanyModel;
import com.main.enniyal.model.VendorModel;
import com.main.enniyal.repository.CompanyRepository;

@Service
public class VendorServiceImpl implements VendorService{

	@Autowired
	VendorDAO vendorDAO;
	
	@Autowired
	CompanyRepository companyRepo;
	
	@Override
	public void addVendor(VendorDTO vendorDTO) {
		ModelMapper mm = new ModelMapper();
		VendorModel vendorModel = mm.map(vendorDTO,VendorModel.class);
		CompanyModel companyModel = companyRepo.getUserDataById(vendorDTO.getCompanyId());
		vendorModel.setCompanyModel(companyModel);
		vendorDAO.addVendor(vendorModel);
	}

}
