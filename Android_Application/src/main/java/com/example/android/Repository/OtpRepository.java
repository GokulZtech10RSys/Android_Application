package com.example.android.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.android.Entity.OtpEntity;



@Repository
public interface OtpRepository extends JpaRepository<OtpEntity, Long> {
    OtpEntity findByPhoneNumber(String phoneNumber);
}