package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "PropertySubType")
public class ModelPropertySubType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PropertySubTypeID;

    @ManyToOne
    @JoinColumn(name = "PropertyTypeID")
    private ModelPropertyType PropertyType;

    private String SubTypeName;

    private Long CreatedBy;

    public Long getPropertySubTypeID() {
        return PropertySubTypeID;
    }

    public void setPropertySubTypeID(Long propertySubTypeID) {
        PropertySubTypeID = propertySubTypeID;
    }

    public ModelPropertyType getPropertyType() {
        return PropertyType;
    }

    public void setPropertyType(ModelPropertyType propertyType) {
        PropertyType = propertyType;
    }

    public String getSubTypeName() {
        return SubTypeName;
    }

    public void setSubTypeName(String subTypeName) {
        SubTypeName = subTypeName;
    }

    public Long getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Long createdBy) {
        CreatedBy = createdBy;
    }
}
