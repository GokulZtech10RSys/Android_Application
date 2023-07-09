package com.example.android.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
		
		@Id
		@Column(name="customerid", length = 45)
		@GeneratedValue(strategy =GenerationType.AUTO)
		private int customerid;
		
		@Column(name="customerame",length = 255)
		private String customername;
		
		@Column(name="email",length=255)
		private String email;
		
		@Column(name="password",length=255)
		private String password;

		public Customer(int customerid, String customername, String email, String password) {
			this.customerid = customerid;
			this.customername = customername;
			this.email = email;
			this.password = password;
		}

		public Customer() {
		}

		public int getCustomerid() {
			return customerid;
		}

		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}

		public String getCustomername() {
			return customername;
		}

		public void setCustomername(String customername) {
			this.customername = customername;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Customer [customerid=" + customerid + ", customername=" + customername + ", email=" + email
					+ ", password=" + password + "]";
		}
		
		
		
}