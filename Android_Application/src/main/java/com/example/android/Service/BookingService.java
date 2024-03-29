package com.example.android.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.android.Entity.Booking;
import com.example.android.Repository.BookingRepository;



@Service
public class BookingService {
	
	@Autowired
    private BookingRepository bookingRepository;

    

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }


}
 