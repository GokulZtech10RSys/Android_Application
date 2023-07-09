package com.example.android.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.android.Entity.Recharge;
import com.example.android.Service.RechargeService;



@RestController
@RequestMapping("/v4/api")
public class RechargeController {

	
	@Autowired
    private RechargeService rechargeService;

  
    @PostMapping("/generate")
    public ResponseEntity<List<Recharge>> generateRecharges(@RequestParam("numberOfDays") int numberOfDays,
                                                            @RequestParam("amount") double amount) {
        List<Recharge> recharges = rechargeService.generateRecharges(numberOfDays, amount);
        return ResponseEntity.status(HttpStatus.CREATED).body(recharges);
    }


}