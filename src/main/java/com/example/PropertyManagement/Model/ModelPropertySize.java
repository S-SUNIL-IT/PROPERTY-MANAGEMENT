package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "PropertySize")
public class ModelPropertySize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PropertySizeID;

    private String PropertySizeName;

    @ManyToOne
    @JoinColumn(name = "PropertySubTypeID")
    private ModelPropertySubType PropertySubType;

    private String Unit;

    private Long CreatedBy;

    public Long getPropertySizeID() {
        return PropertySizeID;
    }

    public void setPropertySizeID(Long propertySizeID) {
        PropertySizeID = propertySizeID;
    }

    public String getPropertySizeName() {
        return PropertySizeName;
    }

    public void setPropertySizeName(String propertySizeName) {
        PropertySizeName = propertySizeName;
    }

    public ModelPropertySubType getPropertySubType() {
        return PropertySubType;
    }

    public void setPropertySubType(ModelPropertySubType propertySubType) {
        PropertySubType = propertySubType;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public Long getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Long createdBy) {
        CreatedBy = createdBy;
    }
}
