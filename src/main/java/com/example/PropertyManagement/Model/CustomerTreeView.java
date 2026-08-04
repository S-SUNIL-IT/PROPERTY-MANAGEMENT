package com.example.PropertyManagement.Model;

import java.util.ArrayList;
import java.util.List;

public class CustomerTreeView {

    private Long customerId;
    private String firstName;
    private String email;
    private String mobile;
    private String address;
    private String stateName;
    private String countryName;

    private List<PropertyNode> properties = new ArrayList<>();

    public CustomerTreeView() {}

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

    public List<PropertyNode> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyNode> properties) {
        this.properties = properties;
    }
}
