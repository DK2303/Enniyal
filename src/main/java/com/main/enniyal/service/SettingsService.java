package com.main.enniyal.service;

import com.main.enniyal.dto.SettingsDTO;
import com.main.enniyal.model.SettingsModel;

public interface SettingsService {

	SettingsModel addCompanyInfo(SettingsDTO request);

	SettingsModel getCompanyInfo(String companyName);

	SettingsModel editCompanyInfo(SettingsDTO request);
}
