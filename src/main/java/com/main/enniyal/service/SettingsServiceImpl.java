package com.main.enniyal.service;

import org.json.JSONObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.enniyal.dao.SettingsDAO;
import com.main.enniyal.model.SettingsModel;

@Service
public class SettingsServiceImpl implements SettingsService{

	@Autowired
	SettingsDAO settingsDAO;
	
	@Override
	public void addCompanyInfo(String request) {
		//ObjectMapper om = new ObjectMapper();
		
		try {
			//JSONObject resObject = new JSONObject(request);
			//SettingsModel settingsModel = om.readValue(request,SettingsModel.class);
			//SettingsModel settingsModel = settingsMapper(resObject);
			System.out.println("Model Mapper Completed");
			//settingsDAO.addCompanyInfo(settingsModel);
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			System.out.println("Inside Exception");
			e.printStackTrace();
		}
	}
	
	private SettingsModel settingsMapper(JSONObject resObject) {
		SettingsModel settingsModel = new SettingsModel();
		settingsModel.setCompanyName(resObject.getString("companyName"));
		System.out.println("Before Company LOGO");
		settingsModel.setCompanyLogo((byte[])resObject.get("companyLogo"));
		System.out.println("After Company LOGO");
		settingsModel.setFileName(resObject.getString("fileName"));
		settingsModel.setFileType(resObject.getString("fileType"));
		settingsModel.setMobileNumber(resObject.getBigInteger("mobileNumber"));
		settingsModel.setPhoneNumber(resObject.getString("phoneNumber"));
		settingsModel.setEmail(resObject.getString("email"));
		settingsModel.setWebsiteAddress(resObject.getString("websiteAddress"));
		settingsModel.setGstNumber(resObject.getString("gstNumber"));
		settingsModel.setCinNumber(resObject.getString("cinNumber"));
		settingsModel.setTinNumber(resObject.getString("tinNumber"));
		settingsModel.setCurrency(resObject.getString("currency"));
		settingsModel.setAddress(resObject.getString("address"));
		settingsModel.setNotes(resObject.getString("notes"));
		return settingsModel;
	}

}
