package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "PropertyType")
public class ModelPropertyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PropertyTypeID;

    private String PropertyTypeName;


    private Long CreatedBy;

    public Long getPropertyTypeID() {
        return PropertyTypeID;
    }

    public void setPropertyTypeID(Long propertyTypeID) {
        PropertyTypeID = propertyTypeID;
    }

    public String getPropertyTypeName() {
        return PropertyTypeName;
    }

    public void setPropertyTypeName(String propertyTypeName) {
        PropertyTypeName = propertyTypeName;
    }

    public Long getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Long createdBy) {
        CreatedBy = createdBy;
    }
}
