package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.ModelTenant;
import com.example.PropertyManagement.Model.Tenantlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TenantRepository extends JpaRepository<ModelTenant,Long> {
    @Query(value = "CALL tenantlist()", nativeQuery = true)
    List<Tenantlist> tenantlist();

    @Query(value = "CALL searchTenant(:keyword)", nativeQuery = true)
    List<Tenantlist> searchTenant(@Param("keyword") String keyword);

    ModelTenant findByEmail(String email);
}
