package com.example.android.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.android.Entity.Room;



@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByAvailableDatesContaining(LocalDate date);
}
