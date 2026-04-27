package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.ModelTenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<ModelTenant,Long> {
}
