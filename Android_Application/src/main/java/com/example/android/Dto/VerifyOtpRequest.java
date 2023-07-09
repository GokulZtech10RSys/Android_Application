package com.example.android.Dto;

public class VerifyOtpRequest {
	
	   private String phoneNumber;
	    private String otp;
	    
	    
		public VerifyOtpRequest(String phoneNumber, String otp) {
			this.phoneNumber = phoneNumber;
			this.otp = otp;
		}
		public VerifyOtpRequest() {
		}
		@Override
		public String toString() {
			return "VerifyOtpRequest [phoneNumber=" + phoneNumber + ", otp=" + otp + "]";
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
