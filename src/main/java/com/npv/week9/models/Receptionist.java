package com.npv.week9.models;

import jakarta.persistence.*;

@Entity
public class Receptionist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recId;

    private String recPassword;
    private String phone;
    private String email;

    public Receptionist() {}
    public Receptionist(String recPassword, String phone, String email) {
        this.recPassword = recPassword;
        this.phone = phone;
        this.email = email;
    }

    // getters & setters
    public Long getRecId() { return recId; }
    public void setRecId(Long recId) { this.recId = recId; }
    public String getRecPassword() { return recPassword; }
    public void setRecPassword(String recPassword) { this.recPassword = recPassword; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}