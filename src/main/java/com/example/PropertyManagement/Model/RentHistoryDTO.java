package com.example.PropertyManagement.Model;


import java.time.LocalDate;

public class RentHistoryDTO {

    private String firstName;

    private String propertyName;

    private String month;

    private Double amount;

    private String paymentMode;

    private String paymentReference;

    private LocalDate paidDate;

    private String status;

    public RentHistoryDTO() {
    }

    public RentHistoryDTO(String firstName, String propertyName, String month, Double amount, String paymentMode, String paymentReference, LocalDate paidDate, String status) {
        this.firstName = firstName;
        this.propertyName = propertyName;
        this.month = month;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.paymentReference = paymentReference;
        this.paidDate = paidDate;
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    public LocalDate getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDate paidDate) {
        this.paidDate = paidDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}