package com.example.PropertyManagement.Model;

import jakarta.persistence.*;

@Entity
public class ModelTenantMapProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TenantmapID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TenantID")
    private ModelTenant Tenant;

    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name = "PropertyID")
    private ModelProperty Property;

    private Long CreatedBy;


}
