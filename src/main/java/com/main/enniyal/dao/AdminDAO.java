package com.main.enniyal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.AdminModel;
import com.main.enniyal.repository.AdminRepository;

@Repository
public class AdminDAO {

	@Autowired
	AdminRepository adminRepository;

	public void addAdminInfo(AdminModel adminModel) {
		adminRepository.save(adminModel);
	}
}
