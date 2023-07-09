package com.example.android.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.android.Entity.Room;
import com.example.android.Repository.RoomRepository;



@Service
public class RoomService {
	
	@Autowired
    private RoomRepository roomRepository;


	public List<Room> getAvailableRooms(LocalDate date) {
        return roomRepository.findByAvailableDatesContaining(date);
    }

    public boolean bookRoom(Long roomId, LocalDate date) {
        Optional<Room> optionalRoom = roomRepository.findById(roomId);
        if (optionalRoom.isPresent()) {
            Room room = optionalRoom.get();
            if (room.getAvailableDates().contains(date)) {
                room.getAvailableDates().remove(date);
                roomRepository.save(room);
                return true;
            }
        }
        return false;
    }
}