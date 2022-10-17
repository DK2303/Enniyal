package com.main.enniyal.service;

import com.main.enniyal.dto.AdminDTO;
import com.main.enniyal.dto.ResponseDTO;

public interface AdminService {

	ResponseDTO addAdminInfo(AdminDTO adminDTO) throws Exception;

}
