package com.example.android.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="COURSE_DTLS")
public class Report {
	
	@Id
	private Integer cid;
	private String firstName;
	private String lastName;
	private Double price;
	private String email;
	private String phoneNumber;
	private String houseNo;
	private String city;
	private String address;
	
	
	public Report(Integer cid, String firstName, String lastName, Double price, String email, String phoneNumber,
			String houseNo, String city, String address) {
		super();
		this.cid = cid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.price = price;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.houseNo = houseNo;
		this.city = city;
		this.address = address;
	}


	public Report() {
	}


	@Override
	public String toString() {
		return "Course [cid=" + cid + ", firstName=" + firstName + ", lastName=" + lastName + ", price=" + price
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", houseNo=" + houseNo + ", city=" + city
				+ ", address=" + address + "]";
	}


	public Integer getCid() {
		return cid;
	}


	public void setCid(Integer cid) {
		this.cid = cid;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	
	


}