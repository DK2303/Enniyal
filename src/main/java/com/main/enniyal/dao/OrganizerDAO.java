package com.main.enniyal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.OrganizerModel;
import com.main.enniyal.model.SettingsModel;
import com.main.enniyal.repository.OrganizerRepository;
import com.main.enniyal.repository.SettingsRepository;

@Repository
public class OrganizerDAO {
	@Autowired
	OrganizerRepository organizerRepo;

	@Autowired
	SettingsRepository settingsRepo;

	public OrganizerModel addOrganizer(OrganizerModel organizerModel) {
		return organizerRepo.save(organizerModel);
	}

	public void getOrganizer(String companyName, String organizerName) {

	}

	public void addSettings(SettingsModel settingsModel) {
		settingsRepo.save(settingsModel);
	}

}
