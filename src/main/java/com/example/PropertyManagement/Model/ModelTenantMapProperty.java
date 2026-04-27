package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "TenantMapProperty")
public class ModelTenantMapProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TenantmapID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TenantID")
    private ModelTenant tenant;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PropertyID",unique = true)
    private ModelProperty property;

    private Long CreatedBy;

    public Long getTenantmapID() {
        return TenantmapID;
    }

    public void setTenantmapID(Long tenantmapID) {
        TenantmapID = tenantmapID;
    }

    public ModelTenant getTenant() {
        return tenant;
    }

    public void setTenant(ModelTenant tenant) {
        this.tenant = tenant;
    }

    public ModelProperty getProperty() {
        return property;
    }

    public void setProperty(ModelProperty property) {
        this.property = property;
    }

    public Long getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Long createdBy) {
        CreatedBy = createdBy;
    }
}
