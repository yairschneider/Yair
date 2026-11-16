package com.example.theproject;

public class Client extends User {
    private double budgetLimit;
    private String projectAddress;

    public Client() {
        super();
    }

    public Client(String userId, String name, String email, String phone, double budgetLimit, String projectAddress) {
        super(userId, name, email, phone, "Client");
        this.budgetLimit = budgetLimit;
        this.projectAddress = projectAddress;
    }

    public double getBudgetLimit() {
        return budgetLimit;
    }

    public void setBudgetLimit(double budgetLimit) {
        this.budgetLimit = budgetLimit;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }
}
