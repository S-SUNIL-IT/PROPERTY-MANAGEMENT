package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.ModelReminder;
import com.example.PropertyManagement.Model.ModelTenantMapProperty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReminderRepository extends JpaRepository<ModelReminder,Long> {

    List<ModelReminder> findByTenantMap(ModelTenantMapProperty tenantMap);
}
