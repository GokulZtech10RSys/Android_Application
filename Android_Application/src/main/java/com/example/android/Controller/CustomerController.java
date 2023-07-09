package com.example.android.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.android.Dto.LoginDto;
import com.example.android.Dto.RegisterDto;
import com.example.android.PlayLoad.LoginResponse;
import com.example.android.Service.CustomerService;

@RestController
@RequestMapping("/v2/api")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping(path="/register")
	public ResponseEntity saveEmployee(@RequestBody RegisterDto registerDto)
	{
		Map<String,Object>  repsonse=customerService.addCustomer(registerDto);
		if((boolean)repsonse.get("boolean")!= true) {
			return new ResponseEntity<>(repsonse,HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(repsonse,HttpStatus.OK);
	}
	
	
	@PostMapping(path="/login")
	public ResponseEntity<?> loginEmployee(@RequestBody LoginDto logindto)
	{
		LoginResponse loginMessage = customerService.loginEmployee(logindto);
		return ResponseEntity.ok(loginMessage);
		
	}

}