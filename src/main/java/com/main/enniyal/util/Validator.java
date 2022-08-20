package com.main.enniyal.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

@Service
public class Validator {
	
	
	public String emailValidator(String email) throws Exception {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
		 Pattern pattern = Pattern.compile(regex); 
		 Matcher matcher = pattern.matcher(email);  
		 if(matcher.matches()) {
			 return email;
		 }
		 throw new Exception("Invalid Email Format");
	}
	
	
	public String isValidMobileNo(String mobileNumber) throws Exception {
		Pattern ptrn = Pattern.compile("\\d{10}");  
		Matcher match = ptrn.matcher(mobileNumber); 
		if(match.matches()) {
			return mobileNumber;
		}
		
		throw new Exception("Entered mobile number is invalid.");
	}

}
