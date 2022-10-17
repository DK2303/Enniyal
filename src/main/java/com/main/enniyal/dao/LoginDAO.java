package com.main.enniyal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.AdminModel;
import com.main.enniyal.model.CompanyModel;
import com.main.enniyal.repository.AdminRepository;
import com.main.enniyal.repository.CompanyRepository;

@Repository
public class LoginDAO {

	@Autowired
	AdminRepository adminRepo;
	
	@Autowired
	CompanyRepository companyRepo;
	
	public AdminModel getAdminData(String userName) {
		return adminRepo.getAdminData(userName);
	}

	public CompanyModel getUserData(String userName) {
		return companyRepo.getUserData(userName);
	}

}
