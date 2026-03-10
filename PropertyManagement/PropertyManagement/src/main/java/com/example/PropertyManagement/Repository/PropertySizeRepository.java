package com.example.PropertyManagement.Repository;

import com.example.PropertyManagement.Model.ModelPropertySize;
import com.example.PropertyManagement.Model.ModelPropertySubType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PropertySizeRepository extends JpaRepository<ModelPropertySize,Long> {

    @Query(value = "CALL FindPropertySize(:PSubTypeID)", nativeQuery = true)
    List<ModelPropertySize> findByPropertySubTypeID(@Param("PSubTypeID") Long PropertySubTypeID);
}
