package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.ModelPropertyType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyType extends JpaRepository<ModelPropertyType,Long> {
}
