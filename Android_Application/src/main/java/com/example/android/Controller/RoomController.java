package com.example.android.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.android.Entity.Room;
import com.example.android.Service.RoomService;



@RestController
@RequestMapping("/v7/api")
public class RoomController {
	
	@Autowired
    private RoomService roomService;

    @GetMapping("/available")
    public List<Room> getAvailableRooms(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return roomService.getAvailableRooms(date);
    }

    @PostMapping("/{id}/book")
    public ResponseEntity<String> bookRoom(@PathVariable("id") Long roomId,
                                           @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        if (roomService.bookRoom(roomId, date)) {
            return ResponseEntity.ok("Room booked successfully.");
        } else {
            return ResponseEntity.badRequest().body("Room is not available for booking on the specified date.");
        }
    }
}
