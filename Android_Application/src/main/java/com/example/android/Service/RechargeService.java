package com.example.android.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.android.Entity.Recharge;
import com.example.android.Repository.RechargeRepository;



@Service
public class RechargeService {

	
	@Autowired
    private RechargeRepository rechargeRepository;


	public List<Recharge> generateRecharges(int numberOfDays, double amount) {
		 List<Recharge> recharges = new ArrayList<>();
	        LocalDate currentDate = LocalDate.now();

	        for (int i = 0; i < numberOfDays; i++) {
	            Recharge recharge = new Recharge();
	            recharge.setBookingDate(currentDate.plusDays(i));
	            recharge.setAmount(amount);
	            recharges.add(recharge);
	        }

	        return rechargeRepository.saveAll(recharges);
	    }

}
