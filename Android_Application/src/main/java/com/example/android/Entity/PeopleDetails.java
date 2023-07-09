package com.example.android.Entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="PeopleDetails")
public class PeopleDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer personalid;
	@Column(length=30)
	private String Adharcard;
	@Column(length=30)
	private String PanCard;
	@Column(length=30)
	private String Fathername;
	@Column(length=30)
	private String MotherName;
	@Column(length=30)
	private String Sibiliancename;
	@Column(length=30)
	private String Color;
	@Column(length=30)
	private String Hieight;
	@Column(length=30)
	private String Weight;
	@Column(length=30)
	private String PermanentAddress;
	@Column(length=30)
	private String Currentaddress;
	@Column(length=30)
	private String Officeaddress;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "pepledetails")
	@JsonBackReference
	
	private Set<People>people;

	public PeopleDetails(Integer personalid, String adharcard, String panCard, String fathername, String motherName,
			String sibiliancename, String color, String hieight, String weight, String permanentAddress,
			String currentaddress, String officeaddress, Set<People> people) {
		personalid = personalid;
		Adharcard = adharcard;
		PanCard = panCard;
		Fathername = fathername;
		MotherName = motherName;
		Sibiliancename = sibiliancename;
		Color = color;
		Hieight = hieight;
		Weight = weight;
		PermanentAddress = permanentAddress;
		Currentaddress = currentaddress;
		Officeaddress = officeaddress;
		this.people = people;
	}

	public Integer getpersonalid() {
		return personalid;
	}

	public void setpersonalid(Integer personalid) {
		personalid = personalid;
	}

	public String getAdharcard() {
		return Adharcard;
	}

	public void setAdharcard(String adharcard) {
		Adharcard = adharcard;
	}

	public String getPanCard() {
		return PanCard;
	}

	public void setPanCard(String panCard) {
		PanCard = panCard;
	}

	public String getFathername() {
		return Fathername;
	}

	public void setFathername(String fathername) {
		Fathername = fathername;
	}

	public String getMotherName() {
		return MotherName;
	}

	public void setMotherName(String motherName) {
		MotherName = motherName;
	}

	public String getSibiliancename() {
		return Sibiliancename;
	}

	public void setSibiliancename(String sibiliancename) {
		Sibiliancename = sibiliancename;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getHieight() {
		return Hieight;
	}

	public void setHieight(String hieight) {
		Hieight = hieight;
	}

	public String getWeight() {
		return Weight;
	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public String getPermanentAddress() {
		return PermanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		PermanentAddress = permanentAddress;
	}

	public String getCurrentaddress() {
		return Currentaddress;
	}

	public void setCurrentaddress(String currentaddress) {
		Currentaddress = currentaddress;
	}

	public String getOfficeaddress() {
		return Officeaddress;
	}

	public void setOfficeaddress(String officeaddress) {
		Officeaddress = officeaddress;
	}

	public Set<People> getPeople() {
		return people;
	}

	public void setPeople(Set<People> people) {
		this.people = people;
	}

	public PeopleDetails() {
	}

	@Override
	public String toString() {
		return "PeopleDetails [personalid=" + personalid + ", Adharcard=" + Adharcard + ", PanCard=" + PanCard
				+ ", Fathername=" + Fathername + ", MotherName=" + MotherName + ", Sibiliancename=" + Sibiliancename
				+ ", Color=" + Color + ", Hieight=" + Hieight + ", Weight=" + Weight + ", PermanentAddress="
				+ PermanentAddress + ", Currentaddress=" + Currentaddress + ", Officeaddress=" + Officeaddress
				+ ", people=" + people + "]";
	}
	
	


}