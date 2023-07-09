package com.example.android.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;





@Entity
@Table(name="People")
public class People {
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		
	private Integer peopleid;
	@Column(length=30)
	private String name;
	@Column(length=30)
	private String DoB;
	@Column(length=30)
	private String City;
	@Column(length=30)
	private String Caste;
	@Column(length=30)
	private String Community;
	@Column(length=30)
	private String Degree;
	@Column(length=30)
	private String Occupation;
	@Column(length=30)
	private String MaritalStatus;
	@Column(length=30)
	private String Mobile;
	@Column(length=30)
	private String Gender;
	@Column(length=30)
	private String Salary;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, targetEntity = PeopleDetails.class)
	@JoinTable(name = "PeopleFnldetail", joinColumns = {
			@JoinColumn(name="people_id",referencedColumnName = "peopleid")
	},
	inverseJoinColumns= {
			@JoinColumn(name = "personal_id", referencedColumnName = "Personalid")
	})
	private Set<PeopleDetails>pepledetails;

	public People(Integer peopleid, String name, String doB, String city, String caste, String community, String degree,
			String occupation, String maritalStatus, String mobile, String gender, String salary,
			Set<PeopleDetails> pepledetails) {
		peopleid = peopleid;
		this.name = name;
		DoB = doB;
		City = city;
		Caste = caste;
		Community = community;
		Degree = degree;
		Occupation = occupation;
		MaritalStatus = maritalStatus;
		Mobile = mobile;
		Gender = gender;
		Salary = salary;
		this.pepledetails = pepledetails;
	}

	public Integer getpeopleid() {
		return peopleid;
	}

	public void setpeopleid(Integer peopleid) {
		peopleid = peopleid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDoB() {
		return DoB;
	}

	public void setDoB(String doB) {
		DoB = doB;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCaste() {
		return Caste;
	}

	public void setCaste(String caste) {
		Caste = caste;
	}

	public String getCommunity() {
		return Community;
	}

	public void setCommunity(String community) {
		Community = community;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public String getMaritalStatus() {
		return MaritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public Set<PeopleDetails> getPepledetails() {
		return pepledetails;
	}

	public void setPepledetails(Set<PeopleDetails> pepledetails) {
		this.pepledetails = pepledetails;
	}

	public People() {
	}

	@Override
	public String toString() {
		return "People [peopleid=" + peopleid + ", name=" + name + ", DoB=" + DoB + ", City=" + City + ", Caste=" + Caste
				+ ", Community=" + Community + ", Degree=" + Degree + ", Occupation=" + Occupation + ", MaritalStatus="
				+ MaritalStatus + ", Mobile=" + Mobile + ", Gender=" + Gender + ", Salary=" + Salary + ", pepledetails="
				+ pepledetails + "]";
	}
	
	
	
	

}