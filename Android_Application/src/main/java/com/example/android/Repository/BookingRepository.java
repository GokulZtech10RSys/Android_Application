package com.example.android.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.android.Entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository <Booking, Integer> {

}