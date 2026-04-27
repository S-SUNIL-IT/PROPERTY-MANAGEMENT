package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.ModelPropertyPurpose;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyPurposeRepository extends JpaRepository<ModelPropertyPurpose,Long> {
}
