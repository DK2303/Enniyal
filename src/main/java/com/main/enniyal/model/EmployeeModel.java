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
@Table(name = "company")
public class EmployeeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "employee_id")
	private String employeeId;

	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private CompanyModel companyModel;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "mobile_number")
	private BigInteger mobileNumber;
	
	@Column(name = "date_of_join")
	private String dateOfJoin;
	
	@Column(name = "blood_group")
	private String bloodGroup;
	
	@Column(name = "account_number")
	private String accountNumber;
	
	@Column(name = "bank_name")
	private String bankName;
	
	@Column(name = "ifsc_code")
	private String ifscCode;
	
	@Column(name = "salary")
	private String salary;
	
	@Column(name = "status")
	private String status;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public CompanyModel getCompanyModel() {
		return companyModel;
	}

	public void setCompanyModel(CompanyModel companyModel) {
		this.companyModel = companyModel;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigInteger getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(BigInteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
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
