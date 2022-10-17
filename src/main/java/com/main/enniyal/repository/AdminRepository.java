package com.main.enniyal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.main.enniyal.model.AdminModel;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel, Long> {

	@Query(value = "select * from admin where username = :userName", nativeQuery = true)
	AdminModel getAdminData(@Param("userName") String userName);
}
