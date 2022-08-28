package com.main.enniyal.model;

import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "organizer")
public class OrganizerModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "company_id")
	private CompanyModel companyId;

	@Column(name = "name")
	private String name;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "mobile_number")
	private BigInteger mobileNumber;

	@Column(name = "plan")
	private String plan;

	@Column(name = "validity")
	private Date validity;

	@Column(name = "doj")
	private Date DateOfJoin;

	@Column(name = "payment")
	private String payment;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "isactive")
	private Boolean isActive;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_dt_time")
	private Date createdDtTime;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "updated_dt_time")
	private Date updatedDtTime;

	public OrganizerModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrganizerModel(String name, String companyName, BigInteger mobileNumber, String plan, String payment) {

		this.name = name;
		this.companyName = companyName;
		this.mobileNumber = mobileNumber;
		this.plan = plan;
		this.payment = payment;
	}

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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
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
