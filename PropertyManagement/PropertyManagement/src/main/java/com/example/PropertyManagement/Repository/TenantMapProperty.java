package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.ModelTenantMapProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantMapProperty extends JpaRepository<ModelTenantMapProperty,Long> {
}
