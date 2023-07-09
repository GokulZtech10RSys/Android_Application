package com.example.android.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "recharges")
public class Recharge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "booking_date")
    private LocalDate bookingDate;

    @Column(name = "amount")
    private double amount;

    
    
	public Recharge() {
	}



	public Recharge(Integer id, LocalDate bookingDate, double amount) {
		this.id = id;
		this.bookingDate = bookingDate;
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "Recharge [id=" + id + ", bookingDate=" + bookingDate + ", amount=" + amount + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public LocalDate getBookingDate() {
		return bookingDate;
	}



	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}

	
}