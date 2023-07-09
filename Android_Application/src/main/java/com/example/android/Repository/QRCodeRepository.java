package com.example.android.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.android.Entity.QRCodeEntity;



@Repository
public interface QRCodeRepository extends JpaRepository<QRCodeEntity, Long> {
}