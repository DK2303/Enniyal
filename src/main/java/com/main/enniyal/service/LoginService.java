package com.main.enniyal.service;

import com.main.enniyal.dto.LoginDTO;

public interface LoginService {

	boolean login(LoginDTO loginDTO) throws Exception;
	
}
