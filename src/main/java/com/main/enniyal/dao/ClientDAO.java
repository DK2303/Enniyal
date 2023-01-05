package com.main.enniyal.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.main.enniyal.model.ClientModel;
import com.main.enniyal.repository.ClientRepository;

public class ClientDAO {

	@Autowired
	ClientRepository clientRepo;
	
	
	public void addClient(ClientModel clientModel) {
		clientRepo.save(clientModel);
	}

}
