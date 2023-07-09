package com.example.android.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="qr_code")
public class QRCodeEntity {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column(nullable = false)
	    private String firstName;
	    @Column(nullable = false)
	    private String lastName;
	    @Column(nullable = false, unique = true)
	    private String email;
	    @Column(nullable = false)
	    private String mobile;
	    @Column(nullable = false)
	    private Integer roomNo;
	    @Column(nullable = false)
	    private String roomType;
	    @Column(nullable = false)
	    private String totalMember;
	    @Column(nullable = false)
	    private Long amount;
	    @Column(nullable = false)
	    private String address;
		public QRCodeEntity(Long id, String firstName, String lastName, String email, String mobile, Integer roomNo,
				String roomType, String totalMember, Long amount, String address) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.mobile = mobile;
			this.roomNo = roomNo;
			this.roomType = roomType;
			this.totalMember = totalMember;
			this.amount = amount;
			this.address = address;
		}
		public QRCodeEntity() {
		}
		@Override
		public String toString() {
			return "QRCodeEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", mobile=" + mobile + ", roomNo=" + roomNo + ", roomType=" + roomType + ", totalMember="
					+ totalMember + ", amount=" + amount + ", address=" + address + "]";
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public Integer getRoomNo() {
			return roomNo;
		}
		public void setRoomNo(Integer roomNo) {
			this.roomNo = roomNo;
		}
		public String getRoomType() {
			return roomType;
		}
		public void setRoomType(String roomType) {
			this.roomType = roomType;
		}
		public String getTotalMember() {
			return totalMember;
		}
		public void setTotalMember(String totalMember) {
			this.totalMember = totalMember;
		}
		public Long getAmount() {
			return amount;
		}
		public void setAmount(Long amount) {
			this.amount = amount;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	    
	    
	    
	
}