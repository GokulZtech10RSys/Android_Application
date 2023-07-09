package com.example.android.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.android.Entity.People;
import com.example.android.Service.PeopleListServices;

@RestController
@RequestMapping("/v3/api")
public class PeopleController {
	
	@Autowired
	private PeopleListServices peopleListServices;
	
	@PostMapping("/save")
	public People saveCustomer(@RequestBody People people) {
		return peopleListServices.saveCustomer(people);
	}
	
	@GetMapping("/all")
	public List<People> fetchAll() {
		return peopleListServices.allValues();
	}
	
	@GetMapping("/get/{customerid}")
	public People FetchCustomerId(@PathVariable int peopleid) {
		return peopleListServices.getpeopleById(peopleid);
	}
	
	
	
	

}