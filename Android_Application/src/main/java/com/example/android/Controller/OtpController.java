package com.example.android.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.android.Service.OtpService;
import com.example.android.Dto.OtpRequest;
import com.example.android.Dto.VerifyOtpRequest;



@RestController
@RequestMapping
public class OtpController {

	 private final OtpService otpService;

	    @Autowired
	    public OtpController(OtpService otpService) {
	        this.otpService = otpService;
	    }

    @PostMapping("/send-otp")
    public void sendOtp(@RequestBody OtpRequest otpRequest) {
        otpService.sendOtp(otpRequest.getPhoneNumber());
    }

    @PostMapping("/verify-otp")
    public boolean verifyOtp(@RequestBody VerifyOtpRequest verifyOtpRequest) {
        String phoneNumber = verifyOtpRequest.getPhoneNumber();
        String otp = verifyOtpRequest.getOtp();

        return otpService.verifyOtp(phoneNumber, otp);
    }
}
