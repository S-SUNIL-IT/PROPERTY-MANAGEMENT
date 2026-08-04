package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "TenantMapProperty")
public class ModelTenantMapProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TenantmapID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TenantID")
    private ModelTenant tenant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "propertyId")
    private ModelProperty property;

    private boolean deleted = false;

    private LocalDate startDate;

    private LocalDate endDate;

    private Double rentAmount;

    private String status;

    private Long CreatedBy;

    public Long getTenantmapID() {
        return TenantmapID;
    }

    public void setTenantmapID(Long tenantmapID) {
        TenantmapID = tenantmapID;
    }

    public ModelTenant getTenant() {
        return tenant;
    }

    public void setTenant(ModelTenant tenant) {
        this.tenant = tenant;
    }

    public ModelProperty getProperty() {
        return property;
    }

    public void setProperty(ModelProperty property) {
        this.property = property;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(Double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Long createdBy) {
        CreatedBy = createdBy;
    }
}
