package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "PropertyPurpose")
public class ModelPropertyPurpose{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long propertyPurposeID;

    private String purposeName;

    @ManyToOne
    @JoinColumn(name = "PropertySizeID")
    private ModelPropertySize PropertySize;

    private Long CreatedBy;

    public Long getPropertyPurposeID() {
        return propertyPurposeID;
    }

    public void setPropertyPurposeID(Long propertyPurposeID) {
        this.propertyPurposeID = propertyPurposeID;
    }

    public String getPurposeName() {
        return purposeName;
    }

    public void setPurposeName(String purposeName) {
        this.purposeName = purposeName;
    }

    public ModelPropertySize getPropertySize() {
        return PropertySize;
    }

    public void setPropertySize(ModelPropertySize propertySize) {
        PropertySize = propertySize;
    }

    public Long getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Long createdBy) {
        CreatedBy = createdBy;
    }
}
