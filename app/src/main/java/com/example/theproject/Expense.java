package com.example.theproject;

public class Expense {
    private String expenseId;
    private String description;
    private double amount;
    private String category;
    private boolean isApproved;

    public Expense() {
    }

    public Expense(String expenseId, String description, double amount, String category, boolean isApproved) {
        this.expenseId = expenseId;
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.isApproved = isApproved;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }
}