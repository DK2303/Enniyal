package com.main.enniyal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.enniyal.Projection.GetOrganizerProjection;
import com.main.enniyal.model.CompanyModel;
import com.main.enniyal.repository.CompanyRepository;

@Repository
public class CompanyDAO {

	@Autowired
	CompanyRepository companyRepo;
	
	public CompanyModel addCompany(CompanyModel companyModel) {
		return companyRepo.save(companyModel);
	}
	public List<GetOrganizerProjection> getCompany(Long companyId) {
		return companyRepo.getCompany(companyId);
	}

	public List<GetOrganizerProjection> getOrganizer(Long organizerId) {
		return companyRepo.getOrganizer(organizerId);
	}
	public List<GetOrganizerProjection> getAllCompany() {
		return companyRepo.getAllCompany();
	}
}
