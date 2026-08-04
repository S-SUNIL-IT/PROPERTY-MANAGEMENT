package com.example.PropertyManagement.Model;

public class RentFollowUpDTO {

    private String tenantName;
    private String propertyName;
    private Long tenantmapid;
    private Long rentPaymentId;
    private String month;
    private Double amount;

    public RentFollowUpDTO() {
    }

    public RentFollowUpDTO(String tenantName, String propertyName, Long tenantmapid, Long rentPaymentId, String month, Double amount) {
        this.tenantName = tenantName;
        this.propertyName = propertyName;
        this.tenantmapid = tenantmapid;
        this.rentPaymentId = rentPaymentId;
        this.month = month;
        this.amount = amount;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Long getTenantmapid() {
        return tenantmapid;
    }

    public void setTenantmapid(Long tenantmapid) {
        this.tenantmapid = tenantmapid;
    }

    public Long getRentPaymentId() {
        return rentPaymentId;
    }

    public void setRentPaymentId(Long rentPaymentId) {
        this.rentPaymentId = rentPaymentId;
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
}
