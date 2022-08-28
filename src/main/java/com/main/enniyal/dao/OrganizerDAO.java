package com.main.enniyal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.OrganizerModel;
import com.main.enniyal.repository.OrganizerRepository;

@Repository
public class OrganizerDAO {
	@Autowired
	OrganizerRepository organizerRepo;

	public OrganizerModel addOrganizer(OrganizerModel organizerModel) {
		return organizerRepo.save(organizerModel);
	}

	public void getOrganizer(String companyName, String organizerName) {
		
	}

}
