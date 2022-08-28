package com.main.enniyal.Projection;

import java.math.BigInteger;
import java.util.Date;

public interface GetOrganizerProjection {

	String getCompany_name();
	BigInteger getMobile_number();
	String getPhone_number();
	String getEmail();
	String getWebsite_address();
	String getGst_number();
	String getCin_number();
	String getTin_number();
	String getCurrency();
	String getAddress();
	String getNotes();
	String getPlan();
	String getPayment();
	Date getValidity();
	Date getDoj();
	Boolean getStatus();
	String getPayment_method();
	String getPayment_mode();
	String getName();
}
