package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ModelReminder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reminderId;

    @ManyToOne
    @JoinColumn(name = "TenantmapID")
    private ModelTenantMapProperty tenantMap;

    private LocalDate reminderDate;

    private String message;

    private String status;

    public Long getReminderId() {
        return reminderId;
    }

    public void setReminderId(Long reminderId) {
        this.reminderId = reminderId;
    }

    public ModelTenantMapProperty getTenantMap() {
        return tenantMap;
    }

    public void setTenantMap(ModelTenantMapProperty tenantMap) {
        this.tenantMap = tenantMap;
    }

    public LocalDate getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(LocalDate reminderDate) {
        this.reminderDate = reminderDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
