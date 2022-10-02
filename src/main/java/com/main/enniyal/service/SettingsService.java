package com.main.enniyal.service;

import org.springframework.web.multipart.MultipartFile;

import com.main.enniyal.model.SettingsModel;

public interface SettingsService {

	SettingsModel addSettingsInfo(MultipartFile file, String request);

	SettingsModel getSettingsInfo(String companyName);

	SettingsModel updateSettingsInfo(MultipartFile file, String request);
}
