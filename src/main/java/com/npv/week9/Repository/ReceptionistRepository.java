package com.npv.week9.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npv.week9.models.Receptionist;

public interface ReceptionistRepository extends JpaRepository<Receptionist, Integer> {}