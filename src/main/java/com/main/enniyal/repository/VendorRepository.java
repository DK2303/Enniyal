package com.main.enniyal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.VendorModel;

@Repository
public interface VendorRepository extends JpaRepository<VendorModel, Long> {

}
