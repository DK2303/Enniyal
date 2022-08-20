package com.main.enniyal.dto;

public class AddOrganizerAndCompanyDTO {
	private CompanyDTO company;
	private OrganizerDTO organizer;
	
	
	public CompanyDTO getCompany() {
		return company;
	}
	public void setCompany(CompanyDTO company) {
		this.company = company;
	}
	public OrganizerDTO getOrganizer() {
		return organizer;
	}
	public void setOrganizer(OrganizerDTO organizer) {
		this.organizer = organizer;
	}
}
