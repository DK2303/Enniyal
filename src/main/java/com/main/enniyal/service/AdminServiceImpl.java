package com.main.enniyal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.main.enniyal.dao.AdminDAO;
import com.main.enniyal.dto.AdminDTO;
import com.main.enniyal.dto.ResponseDTO;
import com.main.enniyal.model.AdminModel;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDAO adminDAO;

	@Override
	public ResponseDTO addAdminInfo(AdminDTO adminDTO) throws Exception {
		try {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			AdminModel adminModel = new AdminModel();
			adminModel.setUserName(adminDTO.getUserName());
			System.out.println(passwordEncoder.encode(adminDTO.getPassword()));
			adminModel.setPassword(passwordEncoder.encode(adminDTO.getPassword()));
			adminDAO.addAdminInfo(adminModel);
			ResponseDTO response = new ResponseDTO("success", "Admin user Created Successfully", "test");
			return response;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
