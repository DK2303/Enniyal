package com.main.enniyal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.enniyal.dto.ClientDTO;
import com.main.enniyal.service.ClientService;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

	@Autowired
	ClientService clientService;
	
	@PostMapping("/add")
	public void addClient(@RequestBody ClientDTO clientDTO) {
		clientService.addClient(clientDTO);
	}
	
	@GetMapping("/get")
	public void getClient(@RequestBody ClientDTO clientDTO) {
		clientService.addClient(clientDTO);
	}
	
	@PutMapping("/put")
	public void updateClient(@RequestBody ClientDTO clientDTO) {
		clientService.addClient(clientDTO);
	}
	
	@DeleteMapping("/delete")
	public void deleteClient(@RequestBody ClientDTO clientDTO) {
		clientService.addClient(clientDTO);
	}
}
