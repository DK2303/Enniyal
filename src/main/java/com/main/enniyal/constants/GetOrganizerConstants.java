package com.main.enniyal.constants;

public interface GetOrganizerConstants {

	final static String GET_ALL_COMPANY_AND_ORGANIZER = "SELECT a.company_name,a.mobile_number,a.phone_number,a.email,a.website_address,a.gst_number,a.cin_number,a.tin_number,a.currency,a.address,a.notes,a.plan,a.payment,a.validity,a.doj,a.status,a.payment_method,a.payment_mode,b.name FROM company AS a LEFT JOIN organizer AS b ON a.company_id = b.company_id";
	final static String GET_COMPANY_WITH_ORGANIZERS = "SELECT a.company_name, a.mobile_number, a.phone_number, a.email, a.website_address, a.gst_number, a.cin_number, a.tin_number, a.currency, a.address, a.notes, a.plan, a.payment, a.validity, a.doj, a.status, a.payment_method, a.payment_mode, b.name FROM company AS a INNER JOIN organizer AS b ON a.company_id = b.company_id AND b.company_id = :compId";
	final static String GET_ORGANIZER_WITH_COMPANY = "SELECT a.company_name, a.mobile_number, a.phone_number, a.email, a.website_address, a.gst_number, a.cin_number, a.tin_number, a.currency, a.address, a.notes, a.plan, a.payment, a.validity, a.doj, a.status, a.payment_method, a.payment_mode, b.name FROM company AS a INNER JOIN organizer AS b ON a.company_id = b.company_id AND b.organizer_id = :orgId";
	
}
