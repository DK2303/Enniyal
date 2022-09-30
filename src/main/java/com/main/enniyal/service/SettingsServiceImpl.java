package com.main.enniyal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.enniyal.dao.SettingsDAO;
import com.main.enniyal.dto.SettingsDTO;
import com.main.enniyal.model.SettingsModel;

@Service
public class SettingsServiceImpl implements SettingsService{

	@Autowired
	SettingsDAO settingsDAO;
	
	@Override
	public SettingsModel addCompanyInfo(SettingsDTO request) {
		//ObjectMapper om = new ObjectMapper();
		//System.out.println(request);
		try {
			
			//JSONObject resObject = new JSONObject(request);
			//SettingsModel settingsModel = om.readValue(request,SettingsModel.class);
			SettingsModel settingsModel = settingsMapper(request);
			System.out.println("Model Mapper Completed");
			return settingsDAO.addCompanyInfo(settingsModel);
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			System.out.println("Inside Exception");
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public SettingsModel editCompanyInfo(SettingsDTO request) {
try {
			
			//JSONObject resObject = new JSONObject(request);
			//SettingsModel settingsModel = om.readValue(request,SettingsModel.class);
			SettingsModel settingsModel = settingsMapper(request);
			System.out.println("Model Mapper Completed");
			return settingsDAO.addCompanyInfo(settingsModel);
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			System.out.println("Inside Exception");
			e.printStackTrace();
		}
		return null;
	}
	
	private SettingsModel settingsMapper(SettingsDTO request) {
		SettingsModel settingsModel = new SettingsModel();
		settingsModel.setId(request.getId() != null ? request.getId() : null);
		settingsModel.setCompanyName(request.getCompanyName());
		System.out.println("Before Company LOGO");
		settingsModel.setCompanyLogo(request.getCompanyLogo());
		System.out.println("After Company LOGO");
		settingsModel.setFileName(request.getFileName());
		settingsModel.setFileType(request.getFileType());
		settingsModel.setMobileNumber(request.getMobileNumber());
		settingsModel.setPhoneNumber(request.getPhoneNumber());
		settingsModel.setEmail(request.getEmail());
		settingsModel.setWebsiteAddress(request.getWebsiteAddress());
		settingsModel.setGstNumber(request.getGstNumber());
		settingsModel.setCinNumber(request.getCinNumber());
		settingsModel.setTinNumber(request.getTinNumber());
		settingsModel.setCurrency(request.getCurrency());
		settingsModel.setAddress(request.getAddress());
		settingsModel.setNotes(request.getNotes());
		return settingsModel;
	}

	@Override
	public SettingsModel getCompanyInfo(String companyName) {
		return settingsDAO.getCompanyInfo(companyName);
	}

	

}
