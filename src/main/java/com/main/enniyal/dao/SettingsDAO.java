package com.main.enniyal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.SettingsModel;
import com.main.enniyal.repository.SettingsRepository;

@Repository
public class SettingsDAO {
	@Autowired
	SettingsRepository settingsRepo;
	
	public SettingsModel addCompanyInfo(SettingsModel settingsModel) {
		return settingsRepo.save(settingsModel);
	}

	public SettingsModel getCompanyInfo(String companyName) {	
		SettingsModel settingsModel = settingsRepo.getCompanyInfo(companyName);
		System.out.println(settingsModel);
		return settingsModel;
		
	}
}
