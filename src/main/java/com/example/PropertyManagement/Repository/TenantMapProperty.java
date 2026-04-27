package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.ModelProperty;
import com.example.PropertyManagement.Model.ModelTenantMapProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TenantMapProperty extends JpaRepository<ModelTenantMapProperty,Long> {

    boolean existsByProperty(ModelProperty property);



}
