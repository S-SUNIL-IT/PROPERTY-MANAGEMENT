package com.example.PropertyManagement.Model;

import java.util.ArrayList;
import java.util.List;

public class TenantTreeView {

    private Long tenantId;
    private String firstName;
    private String email;
    private String mobile;
    private String address;
    private String stateName;
    private String countryName;

    private List<PropertyNode> properties = new ArrayList<>();

    public TenantTreeView(Long tenantId, String firstName, String email, String mobile, String address, String stateName, String countryName, List<PropertyNode> properties) {
        this.tenantId = tenantId;
        this.firstName = firstName;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.stateName = stateName;
        this.countryName = countryName;
        this.properties = properties;
    }

    public TenantTreeView() {

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
