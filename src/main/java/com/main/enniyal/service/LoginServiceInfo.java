package com.main.enniyal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.main.enniyal.dao.LoginDAO;
import com.main.enniyal.dto.LoginDTO;
import com.main.enniyal.model.AdminModel;
import com.main.enniyal.model.CompanyModel;

@Service
public class LoginServiceInfo implements LoginService {

	@Autowired
	LoginDAO loginDAO;

	@Override
	public boolean login(LoginDTO loginDTO) throws Exception {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		AdminModel adminModel = loginDAO.getAdminData(loginDTO.getUserName());
		CompanyModel companyModel = loginDAO.getUserData(loginDTO.getUserName());
		if (adminModel == null && companyModel == null) {
			throw new Exception("Incorrect Username");
		} else if (adminModel != null && companyModel == null) {
			if (passwordEncoder.matches(loginDTO.getPassword(), adminModel.getPassword())) {
				// Login Code
				System.out.println("Successfully Loged-In");
				return true;
			} else {
				throw new Exception("Incorrect Password");
			}
		} else if (adminModel == null && companyModel != null) {
			if (passwordEncoder.matches(loginDTO.getPassword(), companyModel.getPassword())) {
				// Login Code
				System.out.println("Successfully Loged-In");
				return true;
			} else {
				throw new Exception("Incorrect Password");
			}
		}
		return false;
	}

}
