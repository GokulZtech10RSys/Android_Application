package com.example.android.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.android.Entity.People;

@Repository
public interface PeopleRepository extends JpaRepository<People,Integer>{

}