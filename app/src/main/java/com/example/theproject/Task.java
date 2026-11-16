package com.example.theproject;

import java.util.Date;

public class Task {
    private String taskId;
    private String taskName;
    private String status; // למשל: "הושלם", "בביצוע", "עוכב"
    private Date dueDate;
    private User responsibleParty; // יחס הכלה (has-a)

    public Task() {
    }

    public Task(String taskId, String taskName, String status, Date dueDate, User responsibleParty) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.dueDate = dueDate;
        this.responsibleParty = responsibleParty;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public User getResponsibleParty() {
        return responsibleParty;
    }

    public void setResponsibleParty(User responsibleParty) {
        this.responsibleParty = responsibleParty;
    }
}