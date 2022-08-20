package com.main.enniyal.dto;

import java.math.BigInteger;
import java.util.Date;

import com.main.enniyal.model.CompanyModel;

public class OrganizerDTO {

	private Long id;
	private CompanyModel companyId;
	private String name;
	private String companyName;
	private BigInteger mobileNumber;
	private String plan;
	private Date validity;
	private Date DateOfJoin;
	private String payment;
	private String status;
	private Boolean isActive;
	private String createdBy;
	private Date createdDtTime;
	private String updatedBy;
	private Date updatedDtTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CompanyModel getCompanyId() {
		return companyId;
	}

	public void setCompanyId(CompanyModel companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public BigInteger getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(BigInteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public Date getValidity() {
		return validity;
	}

	public void setValidity(Date validity) {
		this.validity = validity;
	}

	public Date getDateOfJoin() {
		return DateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		DateOfJoin = dateOfJoin;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDtTime() {
		return createdDtTime;
	}

	public void setCreatedDtTime(Date createdDtTime) {
		this.createdDtTime = createdDtTime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDtTime() {
		return updatedDtTime;
	}

	public void setUpdatedDtTime(Date updatedDtTime) {
		this.updatedDtTime = updatedDtTime;
	}
}
