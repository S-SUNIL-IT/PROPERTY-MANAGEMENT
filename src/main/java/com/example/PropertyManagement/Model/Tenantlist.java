package com.example.PropertyManagement.Model;

public class Tenantlist {

        private Long tenantId;
        private String firstName;
        private String email;
        private String mobile;
        private String address;
        private Long propertyId;
        private String propertyName;
        private String propertyAddress;
        private String stateName;
        private String countryName;

    public Tenantlist(Long tenantId, String firstName, String email, String mobile, String address, Long propertyId, String propertyName, String propertyAddress, String stateName, String countryName) {
        this.tenantId = tenantId;
        this.firstName = firstName;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.propertyId = propertyId;
        this.propertyName = propertyName;
        this.propertyAddress = propertyAddress;
        this.stateName = stateName;
        this.countryName = countryName;
    }

    public Long getTenantId() { 
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}