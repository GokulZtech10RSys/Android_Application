package com.example.android.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.android.Entity.Customer;



@Repository
public interface CustomerRepository extends JpaRepository <Customer , Integer> {
	
Optional<Customer>findByEmailAndPassword(String email , String Password);
	
      Customer findByEmail(String email);

}
