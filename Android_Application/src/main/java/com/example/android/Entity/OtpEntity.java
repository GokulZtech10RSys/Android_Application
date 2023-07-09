package com.example.android.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sms")
public class OtpEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String phoneNumber;
    private String otp;
    
    
	public OtpEntity(Long id, String phoneNumber, String otp) {
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.otp = otp;
	}


	public OtpEntity() {
	}


	@Override
	public String toString() {
		return "OtpEntity [id=" + id + ", phoneNumber=" + phoneNumber + ", otp=" + otp + "]";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getOtp() {
		return otp;
	}


	public void setOtp(String otp) {
		this.otp = otp;
	}
	
	

	
	
    
    
    
    
}