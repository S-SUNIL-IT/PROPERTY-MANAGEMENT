package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Property")
public class ModelProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long propertyId;

    private String PropertyName;

    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private ModelCustomer Customer;

    @ManyToOne
    @JoinColumn(name = "PropertyTypeID")
    private ModelPropertyType PropertyType;

    @ManyToOne
    @JoinColumn(name = "PropertySubType")
    private ModelPropertySubType PropertySubType;

    @ManyToOne
    @JoinColumn(name = "PropertySizeID")
    private ModelPropertySize PropertySize;

    @ManyToOne
    @JoinColumn(name = "propertyPurposeID")
    private  ModelPropertyPurpose PropertyPurpose;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CountryID")
    private ModelCountry country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StateID")
    private ModelState state;

    private String PropertyAddress;

    private  Long CreatedBy;

    private String status;

    @OneToMany(mappedBy = "property")
    private List<ModelTenantMapProperty> tenantMap;

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return PropertyName;
    }

    public void setPropertyName(String propertyName) {
        PropertyName = propertyName;
    }

    public ModelCustomer getCustomer() {
        return Customer;
    }

    public void setCustomer(ModelCustomer customer) {
        Customer = customer;
    }

    public ModelPropertyType getPropertyType() {
        return PropertyType;
    }

    public void setPropertyType(ModelPropertyType propertyType) {
        PropertyType = propertyType;
    }

    public ModelPropertySubType getPropertySubType() {
        return PropertySubType;
    }

    public void setPropertySubType(ModelPropertySubType propertySubType) {
        PropertySubType = propertySubType;
    }

    public ModelPropertySize getPropertySize() {
        return PropertySize;
    }

    public void setPropertySize(ModelPropertySize propertySize) {
        PropertySize = propertySize;
    }

    public ModelPropertyPurpose getPropertyPurpose() {
        return PropertyPurpose;
    }

    public void setPropertyPurpose(ModelPropertyPurpose propertyPurpose) {
        PropertyPurpose = propertyPurpose;
    }

    public ModelCountry getCountry() {
        return country;
    }

    public void setCountry(ModelCountry country) {
        this.country = country;
    }

    public ModelState getState() {
        return state;
    }

    public void setState(ModelState state) {
        this.state = state;
    }

    public String getPropertyAddress() {
        return PropertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        PropertyAddress = propertyAddress;
    }

    public Long getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Long createdBy) {
        CreatedBy = createdBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ModelTenantMapProperty> getTenantMap() {
        return tenantMap;
    }

    public void setTenantMap(List<ModelTenantMapProperty> tenantMap) {
        this.tenantMap = tenantMap;
    }
}
