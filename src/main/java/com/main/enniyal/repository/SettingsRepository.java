package com.main.enniyal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.SettingsModel;

@Repository
public interface SettingsRepository extends JpaRepository<SettingsModel, Long>{
	
}
