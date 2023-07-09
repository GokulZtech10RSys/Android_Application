package com.example.android.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.android.Entity.Recharge;

@Repository
public interface RechargeRepository extends JpaRepository<Recharge, Integer> {
}
