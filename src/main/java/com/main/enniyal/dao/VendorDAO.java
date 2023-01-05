package com.main.enniyal.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.main.enniyal.model.VendorModel;
import com.main.enniyal.repository.VendorRepository;

public class VendorDAO {
	
	@Autowired
	VendorRepository vendorRepo;

	public void addVendor(VendorModel vendorModel) {
		vendorRepo.save(vendorModel);
	}

}
