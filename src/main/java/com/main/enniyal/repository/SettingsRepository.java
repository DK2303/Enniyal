package com.main.enniyal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.SettingsModel;

@Repository
public interface SettingsRepository extends JpaRepository<SettingsModel, Long>{
	
	@Query(value = "select * from settings where company_name = :name",nativeQuery = true)
	public SettingsModel getCompanyInfo(@Param("name") String name);
}
