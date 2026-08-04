package com.example.PropertyManagement.Model;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "RentPayment")
public class ModelRentPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentPaymentId;

    @ManyToOne
    @JoinColumn(name = "TenantmapID")
    private ModelTenantMapProperty tenantMap;

    private String month;
    private Double amount;
    private LocalDate paidDate;
    private String paymentMode;
    private String paymentReference;
    private String status;


    public Long getRentPaymentId() {
        return rentPaymentId;
    }

    public void setRentPaymentId(Long rentPaymentId) {
        this.rentPaymentId = rentPaymentId;
    }

    public ModelTenantMapProperty getTenantMap() {
        return tenantMap;
    }

    public void setTenantMap(ModelTenantMapProperty tenantMap) {
        this.tenantMap = tenantMap;
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

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}