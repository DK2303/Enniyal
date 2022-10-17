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

	@Column(name = "mobile_number")
	private BigInteger mobileNumber;

	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;

	@Column(name = "website_address")
	private String websiteAddress;

	@Column(name = "gst_number")
	private String gstNumber;

	@Column(name = "cin_number")
	private String cinNumber;

	@Column(name = "tin_number")
	private String tinNumber;

	@Column(name = "currency")
	private BigInteger currency;

	@Column(name = "address")
	private String address;

	@Column(name = "notes")
	private String notes;

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

	@Column(name = "plan")
	private String plan;

	@Column(name = "payment")
	private String payment;

	@Column(name = "validity")
	private Date validity;

	@Column(name = "doj")
	private Date dateOfJoin;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "payment_method")
	private String paymentMethod;

	@Column(name = "payment_mode")
	private String paymentMode;

	public CompanyModel() {
		super();
	}

	public CompanyModel(String companyName, BigInteger mobileNumber, String email, String plan, String payment,
			String paymentMethod, String paymentMode) {
		this.companyName = companyName;
		this.mobileNumber = mobileNumber;
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

	public BigInteger getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(BigInteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsiteAddress() {
		return websiteAddress;
	}

	public void setWebsiteAddress(String websiteAddress) {
		this.websiteAddress = websiteAddress;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getCinNumber() {
		return cinNumber;
	}

	public void setCinNumber(String cinNumber) {
		this.cinNumber = cinNumber;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public BigInteger getCurrency() {
		return currency;
	}

	public void setCurrency(BigInteger currency) {
		this.currency = currency;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public Date getValidity() {
		return validity;
	}

	public void setValidity(Date validity) {
		this.validity = validity;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
