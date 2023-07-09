package com.example.android.Entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;



@Entity
@Table(name = "rooms")
public class Room {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_number")
    private String roomNumber;

    private int capacity;

    @ElementCollection
    @CollectionTable(name = "room_available_dates", joinColumns = @JoinColumn(name = "room_id"))
    @Column(name = "available_date")
    private Set<LocalDate> availableDates = new HashSet<>();

	public Room(Long id, String roomNumber, int capacity, Set<LocalDate> availableDates) {
		this.id = id;
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.availableDates = availableDates;
	}

	public Room() {
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", roomNumber=" + roomNumber + ", capacity=" + capacity + ", availableDates="
				+ availableDates + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Set<LocalDate> getAvailableDates() {
		return availableDates;
	}

	public void setAvailableDates(Set<LocalDate> availableDates) {
		this.availableDates = availableDates;
	}

    
    
    
    
}