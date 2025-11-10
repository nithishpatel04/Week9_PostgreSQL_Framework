package com.npv.week9.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npv.week9.models.Rooms;

public interface RoomRepository extends JpaRepository<Rooms, Integer> {}
