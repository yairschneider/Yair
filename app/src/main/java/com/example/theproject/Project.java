package com.example.theproject;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String projectId;
    private String projectName;
    private List<User> stakeholders;  // יחס הכלה
    private List<Task> tasks;          // יחס הכלה
    private List<Expense> expenses;    // יחס הכלה
    private List<PhotoReport> reports; // יחס הכלה

    public Project() {
        this.stakeholders = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.expenses = new ArrayList<>();
        this.reports = new ArrayList<>();
    }

    public Project(String projectId, String projectName) {
        this();
        this.projectId = projectId;
        this.projectName = projectName;
    }

    // מתודות לוגיות לחישובים
    public double calculateCompletionPercentage() {
        if (tasks == null || tasks.isEmpty()) return 0.0;
        int completedCount = 0;
        for (Task task : tasks) {
            if ("הושלם".equals(task.getStatus())) {
                completedCount++;
            }
        }
        return ((double) completedCount / tasks.size()) * 100;
    }

    public double calculateTotalBudget() {
        if (expenses == null) return 0.0;
        double total = 0.0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    // Getters & Setters
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<User> getStakeholders() {
        return stakeholders;
    }

    public void setStakeholders(List<User> stakeholders) {
        this.stakeholders = stakeholders;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public List<PhotoReport> getReports() {
        return reports;
    }

    public void setReports(List<PhotoReport> reports) {
        this.reports = reports;
    }
}
