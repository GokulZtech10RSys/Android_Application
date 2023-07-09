package com.example.android.Service;

import java.util.Map;
import java.util.Optional;
import java.util.*;
import java.util.regex.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.android.Dto.LoginDto;
import com.example.android.Dto.RegisterDto;
import com.example.android.PlayLoad.LoginResponse;
import com.example.android.Repository.CustomerRepository;
import com.example.android.Entity.Customer;



@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public boolean CheckAlreadyRegistered(String email) {
		Customer customerdata = customerRepository.findByEmail(email);
		if(customerdata == null) {
			return true;
		}else {
			return false;
		}
	}
	public  boolean isValidPhoneNumeber(String s){
        Pattern p = Pattern.compile("^\\d{10}$");
        Matcher m = p.matcher(s);
        return (m.matches());
	}
	public  boolean isValidEmail(String email) {
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	}
	public Map<String,Object>  addCustomer(RegisterDto registerDto) {
		Map<String,Object> map = new LinkedHashMap<String,Object>();
		Map<String,Object> data = new HashMap<String,Object>();
		String customer_name = null;
		String email = registerDto.getEmail();
		String customerId = registerDto.getEmail();
		String mobileNumber = registerDto.getMobilenumber();
		if(email!=null || mobileNumber !=null ||customerId !=null ) {
			boolean  bool = isValidEmail(registerDto.getEmail());
			boolean emailBool =CheckAlreadyRegistered(email);
			if(bool && emailBool) {
				Customer customer=new Customer(
						registerDto.getCustomerid(),
						registerDto.getCustomername(),
						registerDto.getEmail(),
						this.passwordEncoder.encode(registerDto.getPassword())
				);
				customerRepository.save(customer);
				customer_name = customer.getCustomername();
			}else {
				map.put("data", data);
				map.put("boolean", false);
				map.put("message","Invalid Email or already Registered");
				return map;
			}
		}
		data.put("userName", customer_name);
		map.put("data", data);
		map.put("boolean", true);
		map.put("message","Successfully registerd");
		return map;
		
	
	}
	
	public LoginResponse loginEmployee(LoginDto logindto)
	{
		   String msg = "";
	        Customer customer1 = customerRepository.findByEmail(logindto.getEmail());
		 if (customer1 != null) {
	            String password = logindto.getPassword();
	            String encodedPassword = customer1.getPassword();
	            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
	            if (isPwdRight) 
	            {
	            	Optional<Customer> customer = customerRepository.findByEmailAndPassword(logindto.getEmail(), encodedPassword);
	                if (customer.isPresent()) 
	                {
	                    return new LoginResponse("Login Success", true);
	                } 
	                else 
	                {
	                    return new LoginResponse("Login Failed", false);
	                }
	            } 
	            else 
	            {
	                return new LoginResponse("password Not Match", false);
	            }
	        }
		 else 
		 {
	            return new LoginResponse("Email not exits", false);
	        }
	}
	
}
	
	