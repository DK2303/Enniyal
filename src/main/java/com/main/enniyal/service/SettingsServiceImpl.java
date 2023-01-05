package com.main.enniyal.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.enniyal.dao.SettingsDAO;
import com.main.enniyal.model.SettingsModel;

@Service
public class SettingsServiceImpl implements SettingsService {

	@Autowired
	SettingsDAO settingsDAO;

	@Override
	public SettingsModel getSettingsInfo(String companyName) {
		SettingsModel settingsModel = settingsDAO.getSettingsInfo(companyName);
		settingsModel.setCompanyLogo(decompressBytes(settingsModel.getCompanyLogo()));
		return settingsModel;
	}

	@Override
	public SettingsModel addSettingsInfo(MultipartFile file, String request) {
		try {
			SettingsModel settingsModel = settingsMapper(file, request);
			System.out.println("Model Mapper Completed");
			return settingsDAO.addCompanyInfo(settingsModel);
		} catch (Exception e) {
			System.out.println("Inside Exception");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public SettingsModel updateSettingsInfo(MultipartFile file, String request) {
		try {
			SettingsModel settingsModel = settingsMapper(file, request);
			System.out.println("Model Mapper Completed");
			return settingsDAO.addCompanyInfo(settingsModel);
		} catch (Exception e) {
			System.out.println("Inside Exception");
			e.printStackTrace();
		}
		return null;
	}

	private SettingsModel settingsMapper(MultipartFile file, String request) {
		SettingsModel settingsModel = new SettingsModel();
		ObjectMapper om = new ObjectMapper();
		try {
			settingsModel = om.readValue(request, SettingsModel.class);
			System.out.println(settingsModel);
			settingsModel.setFileName(file.getOriginalFilename());
			settingsModel.setFileType(file.getContentType());
			settingsModel.setCompanyLogo(compressBytes(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}

//		settingsModel.setId(request.getId() != null ? request.getId() : null);
//		settingsModel.setCompanyName(request.getCompanyName());
//		System.out.println("Before Company LOGO");
//		settingsModel.setCompanyLogo(request.getCompanyLogo());
//		System.out.println("After Company LOGO");
//		settingsModel.setFileName(request.getFileName());
//		settingsModel.setFileType(request.getFileType());
//		settingsModel.setMobileNumber(request.getMobileNumber());
//		settingsModel.setPhoneNumber(request.getPhoneNumber());
//		settingsModel.setEmail(request.getEmail());
//		settingsModel.setWebsiteAddress(request.getWebsiteAddress());
//		settingsModel.setGstNumber(request.getGstNumber());
//		settingsModel.setCinNumber(request.getCinNumber());
//		settingsModel.setTinNumber(request.getTinNumber());
//		settingsModel.setCurrency(request.getCurrency());
//		settingsModel.setAddress(request.getAddress());
//		settingsModel.setNotes(request.getNotes());
		return settingsModel;
	}

	public static byte[] compressBytes(byte[] data) {
		Deflater deflater = new Deflater();
		deflater.setInput(data);
		deflater.finish();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		while (!deflater.finished()) {
			int count = deflater.deflate(buffer);
			outputStream.write(buffer, 0, count);
		}
		try {
			outputStream.close();
		} catch (IOException e) {
		}
		System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);
		return outputStream.toByteArray();
	}

	// uncompress the image bytes before returning it to the angular application
	public static byte[] decompressBytes(byte[] data) {
		Inflater inflater = new Inflater();
		inflater.setInput(data);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		try {
			while (!inflater.finished()) {
				int count = inflater.inflate(buffer);
				outputStream.write(buffer, 0, count);
			}
			outputStream.close();
		} catch (IOException ioe) {
		} catch (DataFormatException e) {
		}
		return outputStream.toByteArray();
	}

}
