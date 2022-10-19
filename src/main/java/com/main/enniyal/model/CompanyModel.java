package com.main.enniyal.model;

import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company")
public class CompanyModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long company_id;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "phone_number")
	private BigInteger phoneNumber;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;

	@Column(name = "plan")
	private String plan;

	@Column(name = "payment")
	private String payment;

	@Column(name = "payment_method")
	private String paymentMethod;

	@Column(name = "payment_mode")
	private String paymentMode;
	
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

	public CompanyModel() {
		super();
	}

	public CompanyModel(String companyName, BigInteger phoneNumber, String email, String plan, String payment,
			String paymentMethod, String paymentMode) {
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.plan = plan;
		this.payment = payment;
		this.paymentMethod = paymentMethod;
		this.paymentMode = paymentMode;
	}

	public Long getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public BigInteger getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
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
