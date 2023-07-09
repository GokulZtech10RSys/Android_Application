package com.example.android.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.android.Entity.OtpEntity;
import com.example.android.Repository.OtpRepository;



@Service
public class OtpService {
	
	
    private final OtpRepository otpRepository;
    private final SmsService smsService;

    @Autowired
    public OtpService(OtpRepository otpRepository, SmsService smsService) {
        this.otpRepository = otpRepository;
        this.smsService = smsService;
    }

    public void sendOtp(String phoneNumber) {
        String otp = generateOtp();

        OtpEntity otpEntity = otpRepository.findByPhoneNumber(phoneNumber);
        if (otpEntity == null) {
            otpEntity = new OtpEntity();
            otpEntity.setPhoneNumber(phoneNumber);
        }
        otpEntity.setOtp(otp);
        otpRepository.save(otpEntity);

        smsService.sendOtp(phoneNumber, otp);
    }

    public boolean verifyOtp(String phoneNumber, String otp) {
        OtpEntity otpEntity = otpRepository.findByPhoneNumber(phoneNumber);
        return otpEntity != null && otpEntity.getOtp().equals(otp);
    }

    private String generateOtp() {
 
        return "343224";  
    }
}