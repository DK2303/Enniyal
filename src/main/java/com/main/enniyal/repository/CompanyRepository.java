package com.main.enniyal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.CompanyModel;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyModel, Long>{
	
	

}
