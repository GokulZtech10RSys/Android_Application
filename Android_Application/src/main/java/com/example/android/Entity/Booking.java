package com.example.android.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="booking")
public class Booking {
	
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name = "start_date")
	    private LocalDate startDate;

	    @Column(name = "end_date")
	    private LocalDate endDate;

	    private LocalTime time;

	    private double amount;

	    @Column(name = "default_validation")
	    private boolean defaultValidation;

	    private LocalDate expiry;
	    

		public Booking() {
		}


		public Booking(Integer id, LocalDate startDate, LocalDate endDate, LocalTime time, double amount,
				boolean defaultValidation, LocalDate expiry) {
			super();
			this.id = id;
			this.startDate = startDate;
			this.endDate = endDate;
			this.time = time;
			this.amount = amount;
			this.defaultValidation = defaultValidation;
			this.expiry = expiry;
		}


		@Override
		public String toString() {
			return "Booking [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", time=" + time
					+ ", amount=" + amount + ", defaultValidation=" + defaultValidation + ", expiry=" + expiry + "]";
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public LocalDate getStartDate() {
			return startDate;
		}


		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}


		public LocalDate getEndDate() {
			return endDate;
		}


		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}


		public LocalTime getTime() {
			return time;
		}


		public void setTime(LocalTime time) {
			this.time = time;
		}


		public double getAmount() {
			return amount;
		}


		public void setAmount(double amount) {
			this.amount = amount;
		}


		public boolean isDefaultValidation() {
			return defaultValidation;
		}


		public void setDefaultValidation(boolean defaultValidation) {
			this.defaultValidation = defaultValidation;
		}


		public LocalDate getExpiry() {
			return expiry;
		}


		public void setExpiry(LocalDate expiry) {
			this.expiry = expiry;
		}
    
	    
	

}