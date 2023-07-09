package com.example.android.Dto;

public class OtpRequest {
	
	
    private String phoneNumber;

	public OtpRequest(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public OtpRequest() {
	}

	@Override
	public String toString() {
		return "OtpRequest [phoneNumber=" + phoneNumber + "]";
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

     
}