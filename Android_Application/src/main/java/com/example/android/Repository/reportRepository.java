package com.example.android.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.android.Entity.Report;

@Repository
public interface reportRepository extends JpaRepository<Report, Integer> {

}