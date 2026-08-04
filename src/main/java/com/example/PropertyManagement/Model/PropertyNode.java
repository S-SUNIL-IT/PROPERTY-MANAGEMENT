package com.example.PropertyManagement.Model;

public class PropertyNode {
    private Long propertyId;
    private String propertyName;
    private String propertyAddress;

    public PropertyNode(Long propertyId, String propertyName, String propertyAddress) {
        this.propertyId = propertyId;
        this.propertyName = propertyName;
        this.propertyAddress = propertyAddress;
    }

    public PropertyNode() {

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
}
