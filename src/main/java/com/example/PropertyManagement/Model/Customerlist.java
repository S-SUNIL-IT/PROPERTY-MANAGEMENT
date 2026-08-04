package com.example.PropertyManagement.Model;

public class Customerlist {

    private Long customerId;
    private String firstName;
    private String email;
    private String mobile;
    private String address;
    private String propertyName;
    private String propertyAddress;
    private String stateName;
    private String countryName;

    public Customerlist(Long customerId, String firstName, String email, String mobile, String address, String propertyName, String propertyAddress, String stateName, String countryName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.propertyName = propertyName;
        this.propertyAddress = propertyAddress;
        this.stateName = stateName;
        this.countryName = countryName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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
