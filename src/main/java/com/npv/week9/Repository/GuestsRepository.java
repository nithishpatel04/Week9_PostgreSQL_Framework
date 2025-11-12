package com.npv.week9.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npv.week9.models.Guests;

public interface GuestsRepository extends JpaRepository<Guests, Integer> {
}
