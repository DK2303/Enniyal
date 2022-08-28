package com.main.enniyal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.main.enniyal.Projection.GetOrganizerProjection;
import com.main.enniyal.constants.GetOrganizerConstants;
import com.main.enniyal.model.CompanyModel;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyModel, Long>{

	@Query(value = GetOrganizerConstants.GET_COMPANY_WITH_ORGANIZERS, nativeQuery = true)
	public List<GetOrganizerProjection> getCompany(@Param("compId") Long compId);

	@Query(value = GetOrganizerConstants.GET_ORGANIZER_WITH_COMPANY, nativeQuery = true)
	public List<GetOrganizerProjection> getOrganizer(@Param("orgId") Long organizerId);

	@Query(value = GetOrganizerConstants.GET_ALL_COMPANY_AND_ORGANIZER, nativeQuery = true)
	public List<GetOrganizerProjection> getAllCompany();

}
