package com.main.enniyal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.enniyal.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>{

}
