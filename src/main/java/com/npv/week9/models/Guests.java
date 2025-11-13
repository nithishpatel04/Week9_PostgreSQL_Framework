package com.npv.week9.models;

import jakarta.persistence.*;

@Entity
@Table(name = "guests")   // <-- plural table name
public class Guests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int guestId;

    private String guestName;
    private String contact;
    private String email;
    private String address;

    public Guests() {}

    public Guests(String guestName, String contact, String email, String address) {
        this.guestName = guestName;
        this.contact = contact;
        this.email = email;
        this.address = address;
    }
    
    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)   
    private Rooms room;
    
    public Rooms getRoom() {
        return room;
    }

    public void setRoom(Rooms room) {
        this.room = room;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
