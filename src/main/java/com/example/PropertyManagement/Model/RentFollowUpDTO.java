package com.example.PropertyManagement.Model;

public class RentFollowUpDTO {

    private String tenantName;
    private String propertyName;
    private String month;
    private Double amount;
    private String mobile;
    private String status;
    private Long tenantmapid;

    public RentFollowUpDTO() {
    }

    public RentFollowUpDTO(String tenantName,
                           String propertyName,
                           String month,
                           Double amount,
                           String mobile,
                           String status,
                           Long tenantmapid) {

        this.tenantName = tenantName;
        this.propertyName = propertyName;
        this.month = month;
        this.amount = amount;
        this.mobile = mobile;
        this.status = status;
        this.tenantmapid = tenantmapid;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTenantmapid() {
        return tenantmapid;
    }

    public void setTenantmapid(Long tenantmapid) {
        this.tenantmapid = tenantmapid;
    }
}