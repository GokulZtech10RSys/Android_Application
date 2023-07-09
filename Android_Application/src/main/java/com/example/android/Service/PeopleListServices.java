package com.example.android.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.android.Entity.People;
import com.example.android.Repository.PeopleRepository;



@Service
public class PeopleListServices {
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	
	public People saveCustomer(People people) {
		return peopleRepository.save(people);
		
	}
	
	public List<People> allValues(){
		return peopleRepository.findAll();
		
	}
	
	public People getpeopleById(int peopleid) {
		return peopleRepository.findById(peopleid).orElse(null);
	}
	
	
	

}