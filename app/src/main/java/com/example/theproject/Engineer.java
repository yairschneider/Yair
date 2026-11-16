package com.example.theproject;

public class Engineer extends User {
    private String engLicense;
    private String specialization;

    public Engineer() {
        super();
    }

    public Engineer(String userId, String name, String email, String phone, String engLicense, String specialization) {
        super(userId, name, email, phone, "Engineer");
        this.engLicense = engLicense;
        this.specialization = specialization;
    }

    public String getEngLicense() { return engLicense; }
    public void setEngLicense(String engLicense) { this.engLicense = engLicense; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
}