package com.npv.week9.models;

import jakarta.persistence.*;

@Entity
@Table(name = "rooms")
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomId;

    private float roomSize;
    private int noOfBeds;
    private String condition;
    private int rent;

    public Rooms() {}
    public Rooms(float roomSize, int noOfBeds, String condition, int rent) {
        this.roomSize = roomSize;
        this.noOfBeds = noOfBeds;
        this.condition = condition;
        this.rent = rent;
    }

    // getters & setters
    public int getRoomId() { return roomId; }
    public void setRoomId(int roomId) { this.roomId = roomId; }
    public float getRoomSize() { return roomSize; }
    public void setRoomSize(float roomSize) { this.roomSize = roomSize; }
    public int getNoOfBeds() { return noOfBeds; }
    public void setNoOfBeds(int noOfBeds) { this.noOfBeds = noOfBeds; }
    public String getCondition() { return condition; }
    public void setCondition(String condition) { this.condition = condition; }
    public int getRent() { return rent; }
    public void setRent(int rent) { this.rent = rent; }
}