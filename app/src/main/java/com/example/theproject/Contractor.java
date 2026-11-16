package com.example.theproject;

public class Contractor extends User {
    private String licenseNumber;
    private String companyName;

    public Contractor() {
        super();
    }

    public Contractor(String userId, String name, String email, String phone, String licenseNumber, String companyName) {
        super(userId, name, email, phone, "Contractor");
        this.licenseNumber = licenseNumber;
        this.companyName = companyName;
    }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
}