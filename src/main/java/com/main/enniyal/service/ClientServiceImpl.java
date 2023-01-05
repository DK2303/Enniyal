package com.main.enniyal.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.enniyal.dao.ClientDAO;
import com.main.enniyal.dto.ClientDTO;
import com.main.enniyal.model.ClientModel;
import com.main.enniyal.model.CompanyModel;
import com.main.enniyal.repository.CompanyRepository;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	CompanyRepository companyRepo;
	
	@Autowired
	ClientDAO clientDAO;

	@Override
	public void addClient(ClientDTO clientDTO) {
		ModelMapper mm = new ModelMapper();
		ClientModel clientModel = mm.map(clientDTO,ClientModel.class);
		CompanyModel companyModel = companyRepo.getUserDataById(clientDTO.getCompanyId());
		clientModel.setCompanyModel(companyModel);
		clientDAO.addClient(clientModel);
	}

}
