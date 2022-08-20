package com.main.enniyal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.CompanyModel;
import com.main.enniyal.repository.CompanyRepository;

@Repository
public class CompanyDAO {

	@Autowired
	CompanyRepository companyRepo;
	
	public CompanyModel addCompany(CompanyModel companyModel) {
		return companyRepo.save(companyModel);
	}

}
