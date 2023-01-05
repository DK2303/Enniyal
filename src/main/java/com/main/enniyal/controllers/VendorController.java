package com.main.enniyal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.enniyal.dto.VendorDTO;
import com.main.enniyal.service.VendorService;

@RestController
@RequestMapping("/api/v1/vendor")
public class VendorController {
	
	@Autowired
	VendorService vendorService;
	
	@PostMapping("/add")
	public void addVendor(@RequestBody VendorDTO vendorDTO) {
		vendorService.addVendor(vendorDTO);
	}
	
	@GetMapping("/get")
	public void getVendor(@RequestBody VendorDTO vendorDTO) {
		vendorService.addVendor(vendorDTO);
	}
	
	@PutMapping("/put")
	public void updateVendor(@RequestBody VendorDTO vendorDTO) {
		vendorService.addVendor(vendorDTO);
	}
	
	@DeleteMapping("/delete")
	public void deleteVendor(@RequestBody VendorDTO vendorDTO) {
		vendorService.addVendor(vendorDTO);
	}

}
